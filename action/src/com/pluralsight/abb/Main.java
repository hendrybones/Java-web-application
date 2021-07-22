package com.pluralsight.abb;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("adding action listener");
        final JTextField field=new JTextField();
        field.setBounds(50,50,150,20);

        JButton b=new JButton("click here");
        b.setBounds(50,100,95,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("welcome to my action");
            }
        });
        frame.add(b);
        frame.add(field);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
