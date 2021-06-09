package Model_View_Controller;

import java.util.Random;

public class MineGrid {
    private static final int MINE = -1;
    private int[][] mineInformation;

    public MineGrid(int numRows, int numCols, int numMines) {
        mineInformation = new int[numRows][numCols];
        initializeCells();
        placeMines(numMines);
        setMineInformation();
    }

    // Check it, whether it is contain a mine or not
    private boolean isMine(int i, int j) {
        return mineInformation[i][j] == MINE;
    }

    // Check the limit for cells
    private boolean isInsideGrid(int i, int j) {
        return (i >= 0 && i < mineInformation.length) &&
                (j >= 0 && j < mineInformation[0].length);
    }

    // If there is a mine, update the surrounding cells.
    private void setMineInformation() {
        for (int i = 0; i < mineInformation.length; i++) {
            for (int j = 0; j < mineInformation[0].length; j++) {
                if (mineInformation[i][j] == MINE) {
                    // Previous row
                    incrementMineCountAt(i-1, j-1);
                    incrementMineCountAt(i-1, j);
                    incrementMineCountAt(i-1,j+1);

                    // Left and Right cells
                    incrementMineCountAt(i,j-1);
                    incrementMineCountAt(i,j+1);

                    // Next row
                    incrementMineCountAt(i+1,j-1);
                    incrementMineCountAt(i+1,j);
                    incrementMineCountAt(i+1,j+1);
                }
            }
        }
    }

    // Increment the cell count which one is wrapped the mine.
    private void incrementMineCountAt(int i, int j) {
        if (isInsideGrid(i,j) && !isMine(i,j))
            mineInformation[i][j] ++;
    }

    // Setting the location of the mines
    private void placeMines(int numMines) {
        Random random = new Random();

        for (int i = 0; i < numMines; i++) {
            int row = random.nextInt(mineInformation.length);
            int column = random.nextInt(mineInformation[0].length);

            if (mineInformation[row][column] != MINE)
                mineInformation[row][column] = MINE;
            else
                i--;
        }
    }

    // Initialize cells with 0
    private void initializeCells () {
            for (int i = 0; i < mineInformation.length; i++) {
                for (int j = 0; j < mineInformation[0].length; j++) {
                    mineInformation[i][j] = 0;
                }
            }
    }
}
