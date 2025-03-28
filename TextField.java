package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField implements ActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 100, 100, 100);
        c.add(t1);
        t1.setText("Ashmita");
        Font font = new Font("Axial", Font.BOLD, 20);
        t1.setFont(font);
        t1.setForeground(Color.BLUE);
        t1.setBackground(Color.YELLOW);
        t1.setEditable(false);
        
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //    String str = t1.getText();
    //    t1.setText(str.toUpperCase());

    // }
}
