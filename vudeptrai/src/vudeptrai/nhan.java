package vudeptrai;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class nhan extends JFrame{

	public nhan() {
        setTitle("Form nhan");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng form này không ảnh hưởng main app
        getContentPane().setLayout(null);

        
    }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
        nhan frame = new nhan();
        frame.setVisible(true);
    }
}
