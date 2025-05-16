package vudeptrai;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tru extends JFrame {
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblResult;

    public tru() {
        setTitle("Phép Trừ");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(175, 46, 96, 19);
        getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(175, 93, 96, 19);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblSoThuNhat = new JLabel("Số thứ nhất:");
        lblSoThuNhat.setBounds(79, 49, 80, 13);
        getContentPane().add(lblSoThuNhat);

        JLabel lblSoThuHai = new JLabel("Số thứ hai:");
        lblSoThuHai.setBounds(79, 96, 80, 13);
        getContentPane().add(lblSoThuHai);

        JButton btnTru = new JButton("Trừ");
        btnTru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(textField.getText());
                    double so2 = Double.parseDouble(textField_1.getText());
                    double ketQua = so1 - so2;
                    lblResult.setText("Kết quả: " + ketQua);
                } catch (NumberFormatException ex) {
                    lblResult.setText("Vui lòng nhập số hợp lệ!");
                }
            }
        });
        btnTru.setBounds(70, 160, 85, 21);
        getContentPane().add(btnTru);

        lblResult = new JLabel("");
        lblResult.setBounds(175, 160, 200, 25);
        getContentPane().add(lblResult);
    }

    public static void main(String[] args) {
        tru frame = new tru();
        frame.setVisible(true);
    }
}
