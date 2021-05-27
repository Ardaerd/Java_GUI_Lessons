package EventExample;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Ok");
        JTextField textField = new JTextField("Enter text here...");
        JLabel label = new JLabel("Some text here");

        MyButtonListener listener = new MyButtonListener(textField, label);
        button.addActionListener(listener);
        textField.addActionListener(listener);

        frame.getContentPane().add(button);
        frame.getContentPane().add(textField);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
