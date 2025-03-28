package GUI;

import javax.swing.*;
import java.awt.*;

public class Button {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 1000);
        Container c = frame.getContentPane();
        c.setLayout(null);

        // JButton btn = new JButton("Click me");
        ImageIcon icon = new ImageIcon("C:\\Users\\anshu\\OneDrive\\Desktop\\Java\\GUI\\Heart.jpg");
        JButton btn = new JButton(icon);
        btn.setSize(icon.getIconWidth(), icon.getIconHeight());
        // btn.setSize(300, 30);
        btn.setLocation(100, 100);
        c.add(btn);

        Font font = new Font("Axial", Font.BOLD, 20);
        btn.setFont(font);
        btn.setText("My button");
        btn.setForeground(Color.ORANGE);
        btn.setBackground(Color.YELLOW);

        // Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        // btn.setCursor(cur);
        // btn.setEnabled(false);
        // btn.setVisible(false);

       
        

    }
}