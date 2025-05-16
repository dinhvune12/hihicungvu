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
	private JTextField soB;
	private JTextField soA;
	private JLabel lblSB;
	private JLabel ketQua; // Label hiển thị kết quả

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
		
		soB = new JTextField();
		soB.setBounds(342, 81, 96, 19);
		frame.getContentPane().add(soB);
		soB.setColumns(10);
		
		soA = new JTextField();
		soA.setBounds(342, 141, 96, 19);
		frame.getContentPane().add(soA);
		soA.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Số A");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(170, 72, 88, 36);
		frame.getContentPane().add(lblNewLabel);
		
		lblSB = new JLabel("Số B");
		lblSB.setEnabled(false);
		lblSB.setBounds(170, 124, 88, 36);
		frame.getContentPane().add(lblSB);
		
		
		JButton cong = new JButton("cong");
		cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					double a = Double.parseDouble(soA.getText());
					double b = Double.parseDouble(soB.getText());
					double tong = a + b;
					// Hiện thông báo kết quả
					javax.swing.JOptionPane.showMessageDialog(null, "Kết quả: " + tong);
				} catch (NumberFormatException ex) {
					// Hiện thông báo lỗi nếu nhập sai
					javax.swing.JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số!");
				}
				
			}
		});
		cong.setBounds(76, 259, 85, 21);
		frame.getContentPane().add(cong);
		
		JButton nhan = new JButton("nhân");
		nhan.setBounds(440, 259, 85, 21);
		frame.getContentPane().add(nhan);
		
		JButton tru = new JButton("trừ");
		tru.setBounds(255, 259, 85, 21);
		frame.getContentPane().add(tru);
		
		JButton chia = new JButton("chia");
		chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(soA.getText());
					double b = Double.parseDouble(soB.getText());
					
					if (b == 0) {
						lblSB.setText("Không thể chia cho 0");
					} else {
						double ketQua = a / b;
						lblSB.setText("Kết quả: " + ketQua);
					}
				} catch (NumberFormatException ex) {
					lblSB.setText("Vui lòng nhập số hợp lệ");
				}
			}
		});
		chia.setBounds(637, 259, 85, 21);
		frame.getContentPane().add(chia);
		
		// Label hiển thị kết quả
		ketQua = new JLabel("Kết quả:");
		ketQua.setBounds(170, 320, 500, 30);
		frame.getContentPane().add(ketQua);

		// Xử lý phép trừ
		tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(soA.getText());
					double b = Double.parseDouble(soB.getText());
					double result = a - b;
					ketQua.setText("Kết quả: " + a + " - " + b + " = " + result);
				} catch (NumberFormatException ex) {
					ketQua.setText("Vui lòng nhập số hợp lệ!");
				}
			}
		});
	}
}
