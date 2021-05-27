package MouseClickCoordinates_Example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setMinimumSize(new Dimension(400,400));

        JLabel label = new JLabel("-,-");

        MyMouseListener listener = new MyMouseListener(label);
        frame.addMouseListener(listener);


        frame.add(label);
        frame.setVisible(true);
    }
}
