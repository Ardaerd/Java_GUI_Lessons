package GridBagLayout_Example;

import javax.swing.*;
import java.awt.*;

public class GridBag3 extends JPanel {
    GridBagConstraints gbc = new GridBagConstraints();

    public GridBag3() {
        setLayout(new GridBagLayout());
        gbc.insets = new Insets(10,10,10,10);
        gbc.weightx = 3.0;
        gbc.weighty = 10.0;
        gbc.fill = GridBagConstraints.BOTH;

        int x,y; // for clarity

        gbc.gridheight = 2;   // span two rows
        addGB(new JButton("One"),0,0);

        gbc.ipadx = 10;  // add padding
        gbc.ipady = 10;
        gbc.gridheight = 1;
        addGB(new JButton("two"),1,0);

        gbc.ipadx = 40;  // add padding
        gbc.ipady = 20;
        addGB(new JButton("three"),2,0);

        gbc.gridwidth = 2;   // span two columns
        gbc.ipadx = 30;  // add padding
        gbc.ipady = 30;
        addGB(new JButton("four"),1,1);

        gbc.gridwidth = 3;
        addGB(new JButton("five"),0,2);

    }

    public void addGB(Component comp, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        add(comp,gbc);
    }
}
