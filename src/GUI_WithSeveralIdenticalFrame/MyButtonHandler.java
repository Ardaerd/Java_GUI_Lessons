package GUI_WithSeveralIdenticalFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonHandler implements ActionListener {

    JTextField field;

    MyButtonHandler(JTextField field) {
        this.field = field;
    }

    public void actionPerformed(ActionEvent e) {
        field.setText("Hello");
    }
}
