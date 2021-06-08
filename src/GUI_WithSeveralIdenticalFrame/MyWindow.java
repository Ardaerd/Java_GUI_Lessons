package GUI_WithSeveralIdenticalFrame;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class MyWindow extends JFrame {

     JPanel mainPanel;
     JButton button;
     JTextField field;
     JLabel label;

    public MyWindow() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);

        mainPanel = new JPanel();
        add(mainPanel);
        mainPanel.setLayout(null);

        button = new JButton("Button");
        button.setBounds(10,10,200,60);
        mainPanel.add(button);

        field = new JTextField("My size is manually set...");
        field.setBounds(10,90,90,40);
        mainPanel.add(field);

        label = new JLabel("I am a label with a border.");
        label.setBounds(50,120,200,80);
        mainPanel.add(label);
        label.setBorder(new EtchedBorder());

        setVisible(true);
    }
}
