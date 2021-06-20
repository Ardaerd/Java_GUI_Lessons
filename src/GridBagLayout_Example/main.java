package GridBagLayout_Example;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLocation(300,55);
        frame.setContentPane(new GridBag3());
        frame.setVisible(true);
    }
}
