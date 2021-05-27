package MouseClickCoordinates_Example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {
    private JLabel label;

    public MyMouseListener (JLabel label) {
        this.label = label;
    }

    public void mouseClicked(MouseEvent e) {
        System.out.print("Clicked at " + e.getX() + ", " + e.getY());
        System.out.print(" on mouse button " + e.getButton());
        System.out.println(" for " + e.getClickCount() + " time(s).");
    }

    public void mousePressed(MouseEvent e) {
        label.setText(e.getX() + ", " + e.getY());
    }
}
