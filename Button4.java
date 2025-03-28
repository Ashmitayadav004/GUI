package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button4 {

    public static Container c;

    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = f.getContentPane();
        JButton btn1 = new JButton("Red");
        JButton btn2 = new JButton("Yellow");
        JButton btn3 = new JButton("Green");
        btn1.setBounds(100, 100, 100, 50);
        btn2.setBounds(100, 160, 100, 50);
        btn3.setBounds(100, 220, 100, 50);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        btn1.addActionListener(new btn1());
        btn2.addActionListener(new btn2());
        btn3.addActionListener(new btn3());
        
    }
}

class btn1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      Button4.c.setBackground(Color.RED);
    }

}

class btn2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      Button4.c.setBackground(Color.YELLOW);
    }

}

class btn3 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      Button4.c.setBackground(Color.GREEN);
    }

}