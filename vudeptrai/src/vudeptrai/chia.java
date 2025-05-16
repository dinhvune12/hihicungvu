package vudeptrai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chia extends JFrame{
	private JTextField textField;
	private JTextField textField_1;

	public chia() {
        setTitle("Form chia");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Số 1:");
        lblNewLabel.setBounds(50, 52, 49, 14);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Số 2:");
        lblNewLabel_1.setBounds(50, 98, 49, 14);
        getContentPane().add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(110, 49, 96, 20);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(109, 95, 96, 20);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Kết Quả:");
        lblNewLabel_2.setBounds(50, 155, 209, 14);
        getContentPane().add(lblNewLabel_2);
        
        JButton btnNewButton = new JButton("Tính");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					double so1 = Double.parseDouble(textField.getText());
					double so2 = Double.parseDouble(textField_1.getText());

					if (so2 == 0) {
						lblNewLabel_2.setText("Kết Quả: Không thể chia cho 0!");
					} else {
						double ketqua = so1 / so2;
						lblNewLabel_2.setText("Kết Quả: " + ketqua);
					}
				} catch (NumberFormatException ex) {
					lblNewLabel_2.setText("Kết Quả: Vui lòng nhập số hợp lệ!");
				}
        	}
        });
        btnNewButton.setBounds(249, 200, 89, 23);
        getContentPane().add(btnNewButton);
           
    }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
    	chia frame = new chia();
        frame.setVisible(true);
    }
}
