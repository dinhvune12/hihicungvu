package vudeptrai;

import javax.swing.*;
import java.awt.event.*;

public class nhan extends JFrame {
	private JTextField textField;     // Số chia
	private JTextField textField_1;   // Số bị chia
	private JTextField textField_2;   // Số lượng
	private JTextField textField_3;   // Đơn giá
	private JLabel lblResultDivide;
	private JLabel lblResultTotal;

	public nhan() {
		setTitle("Tính Toán");
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		// ---------- PHÉP CHIA ----------
		JLabel lblSoA = new JLabel("Số bị chia:");
		lblSoA.setBounds(30, 72, 80, 14);
		getContentPane().add(lblSoA);

		JLabel lblSoB = new JLabel("Số chia:");
		lblSoB.setBounds(30, 118, 80, 14);
		getContentPane().add(lblSoB);

		textField = new JTextField();
		textField.setBounds(120, 69, 100, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(120, 115, 100, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnDivide = new JButton("Chia");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a = Double.parseDouble(textField.getText());
					double b = Double.parseDouble(textField_1.getText());
					if (b == 0) {
						lblResultDivide.setText("Không chia được cho 0");
					} else {
						lblResultDivide.setText("Kết quả: " + (a / b));
					}
				} catch (NumberFormatException ex) {
					lblResultDivide.setText("Vui lòng nhập số hợp lệ!");
				}
			}
		});
		btnDivide.setBounds(80, 160, 80, 23);
		getContentPane().add(btnDivide);

		lblResultDivide = new JLabel("Kết quả:");
		lblResultDivide.setBounds(60, 200, 200, 14);
		getContentPane().add(lblResultDivide);

		// ---------- TÍNH TIỀN ----------
		JLabel lblSL = new JLabel("Số lượng:");
		lblSL.setBounds(260, 72, 80, 14);
		getContentPane().add(lblSL);

		JLabel lblDG = new JLabel("Đơn giá:");
		lblDG.setBounds(260, 118, 80, 14);
		getContentPane().add(lblDG);

		textField_2 = new JTextField();
		textField_2.setBounds(340, 69, 100, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(340, 115, 100, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JButton btnTotal = new JButton("Tính tiền");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int soLuong = Integer.parseInt(textField_2.getText());
					double donGia = Double.parseDouble(textField_3.getText());
					lblResultTotal.setText("Tổng tiền: " + (soLuong * donGia) + " VNĐ");
				} catch (NumberFormatException ex) {
					lblResultTotal.setText("Nhập sai số lượng hoặc đơn giá!");
				}
			}
		});
		btnTotal.setBounds(330, 160, 100, 23);
		getContentPane().add(btnTotal);

		lblResultTotal = new JLabel("Tổng tiền:");
		lblResultTotal.setBounds(310, 200, 200, 14);
		getContentPane().add(lblResultTotal);
	}

	// MAIN để chạy
	public static void main(String[] args) {
		nhan frame = new nhan();
		frame.setVisible(true);
	}
}
