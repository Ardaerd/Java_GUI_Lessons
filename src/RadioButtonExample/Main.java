package RadioButtonExample;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6,1));
        frame.add(mainPanel);

        JRadioButton radio1 = new JRadioButton("Button 1");
        JRadioButton radio2 = new JRadioButton("Button 2");
        JRadioButton radio3 = new JRadioButton("Button 3");
        JRadioButton radio4 = new JRadioButton("Button 4");
        JRadioButton radio5 = new JRadioButton("Button 5");

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1);
        group1.add(radio2);
        group1.add(radio3);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio4);
        group2.add(radio5);

        mainPanel.add(radio1);
        mainPanel.add(radio2);
        mainPanel.add(radio3);
        mainPanel.add(radio4);
        mainPanel.add(radio5);

        JButton button = new JButton("Report");
        mainPanel.add(button);

        button.addActionListener(new ButtonListener(radio1,radio2,radio3,radio4,radio5));

        frame.setVisible(true);
    }
}
