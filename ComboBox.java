package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        frame.setVisible(true);

        String[] values = { "a", "b", "c", "d" };
        JComboBox c1 = new JComboBox(values);
        c1.setBounds(100, 100, 100, 30);
        c.add(c1);
        c1.setFont(new Font("Axial", Font.ITALIC, 15));
        // c1.setSelectedIndex(3);
        // c1.setSelectedItem("a");
        c1.addItem("e");
        c1.removeItem("c");
        JButton btn = new JButton("Submit");
        btn.setBounds(100, 150, 100, 30);
        c.add(btn);

        JLabel label = new JLabel(" ");
        label.setBounds(300, 300, 100, 30);
        c.add(label);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String item = String.valueOf(c1.getSelectedItem());
                label.setText(item);
            }

        });

    }

}
