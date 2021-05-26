package RussianFlag;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setMinimumSize(new Dimension(400,400));

        frame.setLayout(new GridLayout(3,1));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.RED);

        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new GridLayout(5,2));

        panel1.add(new JLabel("One"), BorderLayout.NORTH);
        panel1.add(new JButton("Two"),BorderLayout.CENTER);
        panel1.add(new JTextField("Three"),BorderLayout.SOUTH);

        panel2.add(new JButton("Four"));
        panel2.add(new JLabel("Five"));
        panel2.add(new JTextField("Six"));
        panel2.add(new JButton("Seven"));
        panel2.add(new JLabel("eight"));
        panel2.add(new JButton("Eight"));
        panel2.add(new JButton("ninehundredninetynine"));
        panel2.add(new JLabel("ten"));

        frame.setVisible(true);
    }

}
