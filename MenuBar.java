package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar implements ActionListener {
    public static void main(String[] args) {

        JFrame frame = new JFrame("MenuBar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);

        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");

        file.add(i1);
        file.add(i2);
        file.add(i3);
        menubar.add(file);
        frame.setJMenuBar(menubar);

        
        JMenu edit = new JMenu("Edit");
        JMenuItem i4 = new JMenuItem("Undo");
        JMenuItem i5 = new JMenuItem("Redo");
        JMenuItem i6 = new JMenuItem("Cut");

        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        menubar.add(edit);
        frame.setVisible(true);
    }
    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     t1.setText("New file");
    // }
    
}
