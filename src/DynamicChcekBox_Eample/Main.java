package DynamicChcekBox_Eample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6,1));
        frame.getContentPane().add(mainPanel);

        ArrayList<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();
        ButtonGroup group1 = new ButtonGroup();

        for (int i = 0; i < 5; i++) {
            JCheckBox checkBox = new JCheckBox("check " + (i+1));
            checkBoxes.add(checkBox);
            mainPanel.add(checkBox);
            group1.add(checkBox);
        }

        JButton button = new JButton("Report");
        mainPanel.add(button);

        button.addActionListener(new ButtonListener(checkBoxes));

        frame.setVisible(true);
    }
}
