package vudeptrai;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cong extends JFrame {

    private JTextField textA;
    private JTextField textB;
    private JTextField txtSoDau;
    private JTextField txtSoCuoi;

    public cong() {
        setTitle("Form Cộng và Tính Tiền Nước");
        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        // --- Chức năng cộng ---
        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(50, 30, 45, 13);
        getContentPane().add(lblA);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(50, 60, 45, 13);
        getContentPane().add(lblB);

        textA = new JTextField();
        textA.setBounds(100, 27, 100, 19);
        getContentPane().add(textA);
        textA.setColumns(10);

        textB = new JTextField();
        textB.setBounds(100, 57, 100, 19);
        getContentPane().add(textB);
        textB.setColumns(10);

        JButton btnCong = new JButton("Cộng");
        btnCong.setBounds(100, 90, 85, 21);
        getContentPane().add(btnCong);

        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textA.getText());
                    double b = Double.parseDouble(textB.getText());
                    double tong = a + b;
                    JOptionPane.showMessageDialog(null, "Kết quả cộng: " + tong);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số!");
                }
            }
        });

        // --- Chức năng tính tiền nước ---
        JLabel lblSoDau = new JLabel("Số đầu:");
        lblSoDau.setBounds(50, 160, 60, 13);
        getContentPane().add(lblSoDau);

        JLabel lblSoCuoi = new JLabel("Số cuối:");
        lblSoCuoi.setBounds(50, 190, 60, 13);
        getContentPane().add(lblSoCuoi);

        txtSoDau = new JTextField();
        txtSoDau.setBounds(120, 157, 100, 19);
        getContentPane().add(txtSoDau);
        txtSoDau.setColumns(10);

        txtSoCuoi = new JTextField();
        txtSoCuoi.setBounds(120, 187, 100, 19);
        getContentPane().add(txtSoCuoi);
        txtSoCuoi.setColumns(10);

        JButton btnTinhTien = new JButton("Tính tiền");
        btnTinhTien.setBounds(120, 220, 100, 21);
        getContentPane().add(btnTinhTien);

        btnTinhTien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double soDau = Double.parseDouble(txtSoDau.getText());
                    double soCuoi = Double.parseDouble(txtSoCuoi.getText());

                    if (soCuoi < soDau) {
                        JOptionPane.showMessageDialog(null, "Số cuối phải lớn hơn hoặc bằng số đầu!");
                        return;
                    }

                    double thanhTien = (soCuoi - soDau) * 1000;
                    JOptionPane.showMessageDialog(null, "Thành tiền: " + thanhTien + " VND");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số!");
                }
            }
        });
    }

    public static void main(String[] args) {
        cong frame = new cong();
        frame.setVisible(true);
    }
}
