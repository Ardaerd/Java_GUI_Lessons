package Model_View_Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    private int row, col;
    private MineGrid grid;

    public ButtonHandler(int row, int col, MineGrid g) {
        this.row = row;
        this.col = col;
        grid = g;
    }

    public void actionPerformed(ActionEvent event) {
        if (grid.isMine(row, col)) {
            JOptionPane.showMessageDialog(null,"OOOPS!!!");
        } else {
            // get the number from MineGrid(row,col) and display is on the button
            if (event.getSource() instanceof JButton) {
                JButton button = (JButton) event.getSource();
                button.setText(String.valueOf(grid.getCellContent(row,col)));
            }
        }
    }
}
