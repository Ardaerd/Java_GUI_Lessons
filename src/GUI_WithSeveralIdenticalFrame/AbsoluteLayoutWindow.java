package GUI_WithSeveralIdenticalFrame;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class AbsoluteLayoutWindow {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            JFrame frame = new MyWindow();
            frame.setTitle("Window " + (i+1));
            frame.setLocation(i*100,0);
        }
    }
}
