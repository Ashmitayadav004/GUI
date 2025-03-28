package GUI;

import javax.swing.*;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 500, 1000, 1000);
        Container c = frame.getContentPane();
        c.setLayout(null);
        // to add label of username

        // JLabel label = new JLabel("Username");
        // label.setBounds(100,50, 200, 30);
        // Font font = new Font("Axial", Font.BOLD, 30);
        // label.setFont(font);
        // // label.setText("Password"); //to chnage te label frm usrname to password
        // c.add(label);

        // to add image on the framee
        // ImageIcon icon = new ImageIcon();
        // ImageIcon("C:\\Users\\anshu\\OneDrive\\Desktop\\Java\\GUI\\Heart.jpg");
        // JLabel label = new JLabel(icon);
        // label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
        // c.add(label);

        // to add image and text both together
        ImageIcon icon = new ImageIcon("C:\\Users\\anshu\\OneDrive\\Desktop\\Java\\GUI\\Heart.jpg");
        JLabel label = new JLabel("Text", icon, JLabel.CENTER);
        label.setBounds(10, 100, 400, 400);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setForeground(Color.BLACK);
        c.add(label);
        System.out.println("Icon Width: " + icon.getIconWidth());
        System.out.println("Icon Height: " + icon.getIconHeight());

    }
}
