package JTabbedPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPane extends JPanel {
    private JTabbedPane pane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton panel1Button;
    private JButton panel2Button;
    private JButton panel3Button;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public TabbedPane() {
        super();
        setSize(600,600);
        pane = new JTabbedPane();
        add(pane);

        // For Panel_1
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        label1 = new JLabel("Enter First Name Here");
        field1 = new JTextField(20);
        field1.setFont(new Font("Calibri",Font.BOLD,18));
        field1.setForeground(Color.GREEN);
        panel1Button = new JButton("Enter");
        panel1Button.setSize(50,50);
        panel1Button.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null,"First Name is " + field1.getText());
                    }
        });
        panel1.add(label1, BorderLayout.NORTH);
        panel1.add(field1, BorderLayout.CENTER);
        panel1.add(panel1Button, BorderLayout.SOUTH);
        pane.addTab("First Name",panel1);

        // For Panel_2
        panel2 = new JPanel();
        label2 = new JLabel("Enter Last Name Here");
        field2 = new JTextField(20);
        field2.setFont(new Font("Calibri",Font.BOLD,18));
        field2.setForeground(Color.GREEN);
        panel2Button = new JButton("Enter");
        panel2Button.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null,"First Name is " + field2.getText());
                    }
                });
        panel2.add(label2, BorderLayout.NORTH);
        panel2.add(field2, BorderLayout.CENTER);
        panel2.add(panel2Button, BorderLayout.SOUTH);
        pane.addTab("Last Name",panel2);


    }
}
