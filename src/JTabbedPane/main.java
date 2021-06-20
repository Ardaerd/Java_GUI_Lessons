package JTabbedPane;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.add(new TabbedPane());
        frame.setVisible(true);
    }
}
