package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {
    private Container c;
    private JLabel label1, label2, result;
    private JTextField t1, t2;
    private JButton add, sub, mul, div;

    Myframe() {
        setTitle("Simple Calculator");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(300, 300);

        c = getContentPane();
        c.setLayout(null);
        label1 = new JLabel("First num");
        label2 = new JLabel("Second num");
        label1.setBounds(10, 20, 100, 20);
        label2.setBounds(10, 50, 100, 20);
        c.add(label1);
        c.add(label2);

        t1 = new JTextField();
        t1.setBounds(120, 20, 100, 20);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(120, 50, 100, 20);
        c.add(t2);

        add = new JButton("+");
        add.setBounds(10, 80, 50, 30);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(70, 80, 50, 30);
        c.add(sub);

        mul = new JButton("*");
        mul.setBounds(130, 80, 50, 30);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(190, 80, 50, 30);
        c.add(div);

        result = new JLabel("Result : ");
        result.setBounds(10, 120, 150, 20);
        c.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            result.setText("Result : " + c);
        }

        if (e.getSource() == sub) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            result.setText("Result : " + c);
        }

        if (e.getSource() == mul) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a * b;
            result.setText("Result : " + c);
        }

        if (e.getSource() == div) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a / b;
            result.setText("Result : " + c);
        }
    }

}

public class SImpleCalc {
    public static void main(String[] args) {
        Myframe frame = new Myframe();
    }
}
