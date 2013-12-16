package main;

import java.util.ArrayList;
import java.util.List;

/**
 Any live cell with fewer than two live neighbours dies, as if caused by under-population.
 Any live cell with two or three live neighbours lives on to the next generation.
 Any live cell with more than three live neighbours dies, as if by overcrowding.
 Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 */
public class Scanner {

    private Boolean[][] block;
    private int colNum =0;
    private int rowNum =0;

    public Scanner(Boolean[][] block)
    {
        this.block = block;
        colNum = block.length;
        rowNum = block[0].length;
    }

    public void genNext()
    {
        Boolean[][] newBlock = new Boolean[block.length][block[0].length];

        for (int i=0;i<colNum;i++)
        {
            for (int j=0;j<rowNum;j++)
            {
                List<Boolean> neighbours = new ArrayList<Boolean>();
                pareNeighbours(i,j,neighbours);
            }
        }
    }

    private void pareNeighbours(int colIndex, int rowIndex, List<Boolean> neighbours) {

        for (int i = colIndex-1;i<=colIndex+1;i++)
        {
            for (int j = colIndex-1;j<=rowIndex+1;j++)
            {
                try
                {
                    neighbours.add(block[i][j]);
                }
                catch (Exception e)
                {
                    neighbours.add(false);
                }
            }
        }
    }
}
