package GUI;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.*;

public class Radio {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 700, 500);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        frame.setVisible(true);

        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(100, 50, 100, 20);
        c.add(radio1);

        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(200, 50, 100, 20);
        c.add(radio2);

        ButtonGroup gender = new ButtonGroup();// used to select or tick only one item from thr list
        gender.add(radio1);
        gender.add(radio2);

        JRadioButton gen = new JRadioButton("General");
        JRadioButton obc = new JRadioButton("OBC");
        JRadioButton sc = new JRadioButton("SC");
        JRadioButton st = new JRadioButton("ST");

        gen.setBounds(100, 100, 100, 20);
        obc.setBounds(200, 100, 100, 20);
        sc.setBounds(300, 100, 100, 20);
        st.setBounds(400, 100, 100, 20);

        c.add(gen);
        c.add(obc);
        c.add(sc);
        c.add(st);

        ButtonGroup caste = new ButtonGroup();
        caste.add(gen);
        caste.add(obc);
        caste.add(sc);
        caste.add(st);

        gen.setSelected(true);
        radio1.setSelected(true);
        obc.setEnabled(false);
        
        Font font = new Font("Axial", Font.ITALIC, 20);
        radio1.setFont(font);
        radio2.setFont(font);
    }
}
