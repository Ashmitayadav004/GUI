package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Myframe extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox day, month, year;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JTextArea screen;

    Myframe() {
        setTitle("Registration Form");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Name");
        label1.setBounds(20, 50, 100, 20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130, 50, 100, 20);
        c.add(t1);

        label2 = new JLabel("Mobile");
        label2.setBounds(20, 100, 100, 20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(130, 100, 100, 20);
        c.add(t2);

        label3 = new JLabel("Gender");
        label3.setBounds(20, 150, 100, 20);
        c.add(label3);

        male = new JRadioButton("Male");
        male.setBounds(130, 150, 80, 20);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(220, 150, 80, 20);
        c.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        label4 = new JLabel("DOB");
        label4.setBounds(20, 200, 100, 20);
        c.add(label4);

        String days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
        };
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        String[] years = {
                "2020", "2021", "2022", "2023", "2024", "2025"
        };

        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);

        day.setBounds(130, 200, 50, 20);
        month.setBounds(190, 200, 80, 20);
        year.setBounds(280, 200, 80, 20);

        c.add(day);
        c.add(month);
        c.add(year);

        label5 = new JLabel("ADDRESS");
        label5.setBounds(20, 250, 100, 20);
        c.add(label5);

        ta1 = new JTextArea();
        ta1.setBounds(130, 240, 200, 50);
        c.add(ta1);
        ta1.setLineWrap(true);

        terms = new JCheckBox("please accept terms and conditon");
        terms.setBounds(50, 300, 250, 20);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(150, 350, 100, 20);
        c.add(submit);
        submit.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(400, 50, 300, 300);
        c.add(screen);
        screen.setLineWrap(true);

        msg = new JLabel();
        msg.setBounds(20, 400, 250, 20);
        c.add(msg);

    }

    public void actionPerformed(ActionEvent e) {
        if (terms.isSelected()) {
            msg.setText("Registration Successfully");
            String name = t1.getText();
            String mobile = t2.getText();
            String gender = "male";
            if (female.isSelected()) {
                gender = "Female";
            }
            String dob = day.getSelectedItem() + " " + month.getSelectedItem() + " " + year.getSelectedItem();
            String address = ta1.getText();
            screen.setText("Name : " + name + "\n" + " Mobile : " + mobile + "\n" + " Gender : " + gender + "\n"
                    + " DOB : " + dob + "\n" + " Address : " + address);
        }else{
            msg.setText("Accept terms and condition");
            screen.setText(" ");
        }
    }
}

public class RegistrationForm {
    public static void main(String[] args) {
        Myframe frame = new Myframe();
    }
}
