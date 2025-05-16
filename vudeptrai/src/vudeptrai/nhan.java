package vudeptrai;

import javax.swing.*;
import java.awt.event.*;

public class nhan extends JFrame {
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblResult;

    public nhan() {
        setTitle("Form nhân");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(144, 54, 86, 20);
        getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(144, 103, 86, 20);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel = new JLabel("Số A");
        lblNewLabel.setBounds(54, 57, 46, 14);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Số B");
        lblNewLabel_1.setBounds(54, 106, 46, 14);
        getContentPane().add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Nhân");
        btnNewButton.setBounds(141, 152, 89, 23);
        getContentPane().add(btnNewButton);

        lblResult = new JLabel("Kết quả sẽ hiển thị ở đây");
        lblResult.setBounds(144, 204, 200, 14);
        getContentPane().add(lblResult);

        // Bắt sự kiện nút nhân
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textField.getText());
                    double b = Double.parseDouble(textField_1.getText());
                    double result = a * b;
                    lblResult.setText("Kết quả: " + result);
                } catch (NumberFormatException ex) {
                    lblResult.setText("Nhập số chuẩn vào nha bạn!");
                }
            }
        });
    }

    public static void main(String[] args) {
        nhan frame = new nhan();
        frame.setVisible(true);
    }
}
