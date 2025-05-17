package vudeptrai;

import javax.swing.*;
import java.awt.event.*;

public class tru extends JFrame {

    private JTextField txtSo1;
    private JTextField txtSo2;
    private JLabel lblKetQua;

    private JTextField txtChieuDai;
    private JTextField txtChieuRong;
    private JLabel lblDienTich;

    public tru() {
        setTitle("Form tru và diện tích HCN");
        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        // Phần trừ
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 30, 100, 25);
        getContentPane().add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(140, 30, 200, 25);
        getContentPane().add(txtSo1);

        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 70, 100, 25);
        getContentPane().add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(140, 70, 200, 25);
        getContentPane().add(txtSo2);

        JButton btnTru = new JButton("Trừ");
        btnTru.setBounds(140, 110, 100, 30);
        getContentPane().add(btnTru);

        lblKetQua = new JLabel("Kết quả: ");
        lblKetQua.setBounds(30, 150, 300, 25);
        getContentPane().add(lblKetQua);

        btnTru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double ketQua = so1 - so2;
                    lblKetQua.setText("Kết quả: " + ketQua);
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập đúng định dạng số!");
                }
            }
        });

        // Phần tính diện tích hình chữ nhật
        JLabel lblChieuDai = new JLabel("Chiều dài:");
        lblChieuDai.setBounds(30, 200, 100, 25);
        getContentPane().add(lblChieuDai);

        txtChieuDai = new JTextField();
        txtChieuDai.setBounds(140, 200, 200, 25);
        getContentPane().add(txtChieuDai);

        JLabel lblChieuRong = new JLabel("Chiều rộng:");
        lblChieuRong.setBounds(30, 240, 100, 25);
        getContentPane().add(lblChieuRong);

        txtChieuRong = new JTextField();
        txtChieuRong.setBounds(140, 240, 200, 25);
        getContentPane().add(txtChieuRong);

        JButton btnTinhDT = new JButton("Tính diện tích");
        btnTinhDT.setBounds(140, 280, 150, 30);
        getContentPane().add(btnTinhDT);

        lblDienTich = new JLabel("Diện tích: ");
        lblDienTich.setBounds(30, 320, 300, 25);
        getContentPane().add(lblDienTich);

        btnTinhDT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dai = Double.parseDouble(txtChieuDai.getText());
                    double rong = Double.parseDouble(txtChieuRong.getText());
                    double dientich = dai * rong;
                    lblDienTich.setText("Diện tích: " + dientich);
                } catch (NumberFormatException ex) {
                    lblDienTich.setText("Vui lòng nhập đúng định dạng số!");
                }
            }
        });
    }

    public static void main(String[] args) {
        tru frame = new tru();
        frame.setVisible(true);
    }
}
