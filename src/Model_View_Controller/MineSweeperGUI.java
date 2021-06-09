package Model_View_Controller;

import javax.swing.*;
import java.awt.*;

public class MineSweeperGUI extends JPanel {

    // The visualization will be implemented in MineSweeperGUI Class

    public MineSweeperGUI (int numRows, int numCols, int numMines) {

        setLayout(new GridLayout(numRows,numCols));

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                JButton button = new JButton();
                add(button);
            }
        }
    }
}