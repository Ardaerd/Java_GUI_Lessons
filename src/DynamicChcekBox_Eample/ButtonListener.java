package DynamicChcekBox_Eample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListener implements ActionListener {
    private ArrayList<JCheckBox> checkBoxes;

    public ButtonListener(ArrayList<JCheckBox> checkBoxes) {
        this.checkBoxes = checkBoxes;
    }

    public void actionPerformed(ActionEvent e) {
        String msg = "Status: [";

        for (int i = 0; i < checkBoxes.size(); i++) {

            if (i > 0)
                msg += ", ";

            msg += checkBoxes.get(i).isSelected();

        }
        msg += "]";

        JOptionPane.showMessageDialog(null,msg);
    }
}
