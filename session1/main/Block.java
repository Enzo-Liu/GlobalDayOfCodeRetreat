package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Block {

    int colNum = 0;
    int rowNum = 0;
    Boolean[][] block = null;

    public static void main(String[] args) throws IOException {
        Block block1 = new Block(10,10);

        for (int i=0;i<100;i++)
        {
            block1.init();
            block1.print();
        }
    }

    public Block(int colNum,int rowNum)
    {
        this.colNum = colNum;
        this.rowNum = rowNum;
        block = new Boolean[colNum][rowNum];
    }

    public void init()
    {
        Random random = new Random();
        for (int i=0;i<colNum;i++)
        {
            for (int j=0;j<rowNum;j++)
            {
                block[i][j] = random.nextBoolean();
            }
        }
    }

    public void print() throws IOException {

        for(Boolean[] col:block)
        {
            for (Boolean state:col)
            {
                if (state==true)
                {
                    System.out.print("#");
                } else
                {
                    System.out.print("*");
                }
            }
        }
    }
}
