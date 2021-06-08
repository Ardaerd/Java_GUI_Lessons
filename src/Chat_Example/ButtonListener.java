package Chat_Example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JButton button;
    private JTextField textField;
    private JTextArea textArea;

    public ButtonListener(JButton button, JTextField textField, JTextArea textArea) {
        this.button = button;
        this.textField = textField;
        this.textArea = textArea;
    }

    public ButtonListener(JButton button, JTextField textField) {
        this(button, textField,null);
    }



    public void actionPerformed(ActionEvent e) {
        if (button.getText().equals("Send")) {
            String msg = textField.getText();
            textArea.setText(msg + "\n");
            textField.setText("");
        }

        else if (button.getText().equals("Reset")) {
            textField.setText("");
        }
    }
}
