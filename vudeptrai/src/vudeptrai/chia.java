package vudeptrai;

import javax.swing.*;
import java.awt.event.*;

public class chia extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public chia() {
        setTitle("Form chia");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng form này không ảnh hưởng main app
        getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Số A");
        lblNewLabel.setBounds(40, 45, 49, 14);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Số B");
        lblNewLabel_1.setBounds(40, 122, 49, 14);
        getContentPane().add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(121, 42, 96, 20);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(121, 119, 96, 20);
        getContentPane().add(textField_1);
        
        JLabel lblNewLabel_2 = new JLabel("Kết quả: ");
        lblNewLabel_2.setBounds(40, 170, 148, 14);
        getContentPane().add(lblNewLabel_2);
        
        JButton btnTnh = new JButton("Nhân");
        btnTnh.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					double so1 = Double.parseDouble(textField.getText());
					double so2 = Double.parseDouble(textField_1.getText());

					if (so2 == 0) {
						lblNewLabel_2.setText("Kết Quả: Không thể chia cho 0!");
					} else {
						double ketqua = so1 * so2;
						lblNewLabel_2.setText("Kết Quả: " + ketqua);
					}
				} catch (NumberFormatException ex) {
					lblNewLabel_2.setText("Kết Quả: Vui lòng nhập số hợp lệ!");
				}
        	}
        });
        btnTnh.setBounds(66, 208, 89, 23);
        getContentPane().add(btnTnh);
        
        JButton btnNewButton = new JButton("Chia hết");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			int a = Integer.parseInt(textField.getText());
        			int b = Integer.parseInt(textField_1.getText());

        			if (a == 0) {
        				lblNewLabel_2.setText("Kết Quả: Không thể chia cho 0!");
        			} else if (b % a == 0) {
        				lblNewLabel_2.setText("Kết Quả: " + a + " chia hết cho " + b);
        			} else {
        				lblNewLabel_2.setText("Kết Quả: " + a + " không chia hết cho " + b);
        			}
        		} catch (NumberFormatException ex) {
        			lblNewLabel_2.setText("Kết Quả: Vui lòng nhập số nguyên hợp lệ!");
        		}
        	}
        });
        btnNewButton.setBounds(214, 208, 89, 23);
        getContentPane().add(btnNewButton);
        
        

        
    }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
        chia frame = new chia();
        frame.setVisible(true);
    }
}
