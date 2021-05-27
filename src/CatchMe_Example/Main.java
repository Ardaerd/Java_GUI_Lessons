package CatchMe_Example;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Catch me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        frame.setLayout(null);
        JButton button = new JButton("Catch me!");
        button.setBounds(200,200,100,30);

        button.addMouseListener(new ButtonHandler());

        frame.add(button);
        frame.setVisible(true);

    }
}
