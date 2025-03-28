package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame {
    Container c;
    JButton btn1 = new JButton("Red");

    Myframe() {
        c = this.getContentPane();
        c.setLayout(null);

        btn1.setBounds(100, 100, 100, 50);
        c.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.RED);
            }
        });
    }
}

public class ButtonDemo3 {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
