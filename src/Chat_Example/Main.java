package Chat_Example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Creating the frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout());

        // Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("HELP");

        mb.add(m1);
        mb.add(m2);

        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save as");

        m1.add(open);
        m1.add(save);

        // Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Enter Text:");
        JTextField tf = new JTextField(10); // accept up to 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");

        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the center
        JTextArea ta = new JTextArea();

        send.addActionListener(new ButtonListener(send,tf,ta));
        reset.addActionListener(new ButtonListener(reset,tf));

        // Adding Components to the frame
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
