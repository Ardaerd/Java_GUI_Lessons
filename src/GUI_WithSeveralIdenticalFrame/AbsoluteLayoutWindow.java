package GUI_WithSeveralIdenticalFrame;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class AbsoluteLayoutWindow {
    public static void main(String[] args) {
        JFrame frame = new MyWindow();
        frame.setLocation(0,0);

//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400,400);

//        JPanel mainPanel = new JPanel();
//        frame.add(mainPanel);
//        mainPanel.setLayout(null);
//
//        JButton button = new JButton("Button");
//        button.setBounds(10,10,200,60);
//        mainPanel.add(button);
//
//        JTextField field = new JTextField("My size is manually set...");
//        field.setBounds(10,90,90,40);
//        mainPanel.add(field);
//
//        JLabel label = new JLabel("I am a label with a border.");
//        label.setBounds(50,120,200,80);
//        mainPanel.add(label);
//        label.setBorder(new EtchedBorder());

//        frame.setVisible(true);
    }
}
