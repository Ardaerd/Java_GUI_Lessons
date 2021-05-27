package CatchMe_Example;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ButtonHandler extends MouseAdapter {

    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            Random rand = new Random();
            int x = rand.nextInt(350);
            int y = rand.nextInt(350);
            button.setLocation(x,y);
        }
    }
}
