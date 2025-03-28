package GUI;

import javax.swing.*;
import java.awt.*;

public class Password {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 1000);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 50, 120, 30);
        c.add(pass);
        pass.setText("12345");
        pass.setFont(new Font("Axial", Font.ITALIC, 15));
        // pass.setEchoChar("&");

    }
}
