package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {
    Container c;
    JButton btn1 = new JButton("Red");
    JButton btn2 = new JButton("Yellow");
    JButton btn3 = new JButton("Green");

    Myframe() {
        c = this.getContentPane();
        c.setLayout(null);

        btn1.setBounds(100, 100, 100, 50);
        btn2.setBounds(100, 160, 100, 50);
        btn3.setBounds(100, 220, 100, 50);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            c.setBackground(Color.RED);
        }
        if (e.getSource() == btn2) {
            c.setBackground(Color.YELLOW);
        }
        if (e.getSource() == btn3) {
            c.setBackground(Color.GREEN);
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

public class ButtonDemo2 {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Action Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
