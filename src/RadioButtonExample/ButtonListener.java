package RadioButtonExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private JRadioButton radio4;
    private JRadioButton radio5;

    public ButtonListener(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5) {
        this.radio1 = radio1;
        this.radio2 = radio2;
        this.radio3 = radio3;
        this.radio4 = radio4;
        this.radio5 = radio5;
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "Status: [";
        msg += radio1.isSelected() + ", ";
        msg += radio2.isSelected() + ", ";
        msg += radio3.isSelected() + ", ";
        msg += radio4.isSelected() + ", ";
        msg += radio5.isSelected() + "]";

        JOptionPane.showMessageDialog(null,msg);

    }

}
