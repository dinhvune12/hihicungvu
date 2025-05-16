package vudeptrai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vuneemhihi {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vuneemhihi window = new vuneemhihi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vuneemhihi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1084, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton cong = new JButton("cong");
		cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cong x = new cong();
				x.setVisible(true);
			}
		});
		cong.setBounds(76, 259, 85, 21);
		frame.getContentPane().add(cong);
		
		JButton nhan = new JButton("nhân");//nhan lam
		nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhan x = new nhan();
				x.setVisible(true);
	        }
		});
		nhan.setBounds(440, 259, 85, 21);
		frame.getContentPane().add(nhan);
		
		JButton tru = new JButton("trừ");
		tru.setBounds(255, 259, 85, 21);
		frame.getContentPane().add(tru);
		
		JButton chia = new JButton("chia");
		chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chia x = new chia();
				x.setVisible(true);
			}
		});
		chia.setBounds(637, 259, 85, 21);
		frame.getContentPane().add(chia);

		// Xử lý phép trừ
		tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tru x = new tru();
				x.setVisible(true);	}
		});
	}
}
