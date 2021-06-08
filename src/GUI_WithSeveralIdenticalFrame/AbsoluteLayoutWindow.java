package GUI_WithSeveralIdenticalFrame;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class AbsoluteLayoutWindow {
    public static void main(String[] args) {

        JFrame frame = new MyWindow();
        frame.setTitle("Windows 1");
        frame.setLocation(0,0);

        JFrame frame2 = new MyWindow();
        frame.setTitle("Window 2");
        frame.setLocation(400,0);
    }
}
