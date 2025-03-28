package GUI;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // creating a new frame
        frame.setVisible(true); // by default we wont see screen we should make the
        // visibility to true to see the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// automatically closing the program after closing frame
        frame.setSize(700, 500);// frame size
        frame.setLocation(100, 50);// frame location from x and y line of axis
        frame.setTitle("My lord krishnaa"); // set title of frame
        ImageIcon icon = new ImageIcon("krishna.jpg"); // image setting on icon

        frame.setIconImage(icon.getImage());// setting the image for icon
        Container c = frame.getContentPane();
        c.setBackground(Color.RED);
        frame.setResizable(false);
    }
}
