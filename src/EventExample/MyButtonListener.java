package EventExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {

    private JTextField textField;
    private JLabel label;

    public MyButtonListener(JTextField textField, JLabel label) {
        this.textField = textField;
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {
        label.setText(textField.getText());
    }
}
