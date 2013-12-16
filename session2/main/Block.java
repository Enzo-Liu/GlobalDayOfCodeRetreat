package main;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 10:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class Block {

    public int width=0;
    public int height=0;

    public Boolean[][] block;

    public Block(int colNum,int rowNum)
    {
        width = rowNum;
        height = colNum;
        block = new Boolean[height][width];
    }

    public void init()
    {
        Random random = new Random();
        for (int i=0;i<height;i++)
        {
            for (int j=0;j<width;j++)
            {
                block[i][j] = random.nextBoolean();
            }
        }
    }
}
