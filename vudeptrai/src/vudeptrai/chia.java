package vudeptrai;

import javax.swing.*;
import java.awt.event.*;

public class chia extends JFrame {
	public chia() {
        setTitle("Form chia");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng form này không ảnh hưởng main app
        getContentPane().setLayout(null);

        
    }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
        chia frame = new chia();
        frame.setVisible(true);
    }
}
