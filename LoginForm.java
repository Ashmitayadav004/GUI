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
    Container c;
    JLabel label1, label2;
    JTextField usr;
    JPasswordField pass;
    JButton btn;

    Myframe() {
        setTitle("LoginForm");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(100, 100);
        c = getContentPane();
        c.setLayout(null);
        label1 = new JLabel("Username");
        label2 = new JLabel("Password");
        label1.setBounds(10, 50, 100, 20);
        label2.setBounds(10, 100, 100, 20);
        c.add(label1);
        c.add(label2);

        usr = new JTextField();
        usr.setBounds(120, 50, 120, 20);
        c.add(usr);
        pass = new JPasswordField();
        pass.setBounds(120, 100, 120, 20);
        c.add(pass);

        btn = new JButton("Login");
        btn.setBounds(100, 150, 70, 20);
        c.add(btn);
        btn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Username : " + usr.getText());
        System.out.println("PAssword : " + pass.getText());
        
    }
}

public class LoginForm {
    public static void main(String[] args) {
        Myframe frame = new Myframe();

    }
}
