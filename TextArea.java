package GUI;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.*;

public class TextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 700, 500);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        frame.setVisible(true);

        JTextArea t1 = new JTextArea();
        t1.setBounds(100, 100, 400, 200);
        c.add(t1);
        t1.setText("HIIIIIIIIIIIIIIIIiiiiiiiiiiiiii");
        t1.setFont(new Font("Axial", Font.BOLD, 15));
        t1.setLineWrap(true);
    }
}
