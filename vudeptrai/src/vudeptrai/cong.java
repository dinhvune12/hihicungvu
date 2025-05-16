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

    public cong() {
        setTitle("Form Cộng");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // đóng form này không ảnh hưởng main app
        getContentPane().setLayout(null);

        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(50, 50, 45, 13);
        getContentPane().add(lblA);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(50, 90, 45, 13);
        getContentPane().add(lblB);

        textA = new JTextField();
        textA.setBounds(100, 47, 100, 19);
        getContentPane().add(textA);
        textA.setColumns(10);

        textB = new JTextField();
        textB.setBounds(100, 87, 100, 19);
        getContentPane().add(textB);
        textB.setColumns(10);

        JButton btnCong = new JButton("Cộng");
        btnCong.setBounds(100, 130, 85, 21);
        getContentPane().add(btnCong);

        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textA.getText());
                    double b = Double.parseDouble(textB.getText());
                    double tong = a + b;
                    JOptionPane.showMessageDialog(null, "Kết quả: " + tong);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số!");
                }
            }
        });
    }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
        cong frame = new cong();
        frame.setVisible(true);
    }
}
