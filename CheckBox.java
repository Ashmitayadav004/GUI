package GUI;

import java.awt.*;

import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class CheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 700, 500);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        frame.setVisible(true);

        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Intermediate");
        JCheckBox c3 = new JCheckBox("Graduation");
        JCheckBox c4 = new JCheckBox("Post Graduation");

        c1.setBounds(100, 50, 120, 20);
        c2.setBounds(100, 100, 120, 20);
        c3.setBounds(100, 150, 120, 20);
        c4.setBounds(100, 200, 120, 20);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.setSelected(true);

        Font font = new Font("Axial", Font.ITALIC, 15);
        c1.setFont(font);
        c2.setFont(font);
        c3.setFont(font);
        c4.setFont(font);
    }
}
