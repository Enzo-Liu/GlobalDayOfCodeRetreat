package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Block {

    private boolean[][] block;

    private int colNum;

    private int rowNum;

    public Block(int colNum,int rowNum)
    {
        this.colNum = colNum;
        this.rowNum = rowNum;
        block = new boolean[colNum][rowNum];
    }

    public void init()
    {
        for (int i=0;i<colNum;i++)
        {
            for (int j=0;j<rowNum;j++)
            {
                Random random = new Random(10);
                block[i][j] = random.nextBoolean();
            }
        }
    }

    public List<String> getWorldMap()
    {
        List<String> worldMap = new ArrayList<String>();
        for (int i=0;i<colNum;i++)
        {
            for (int j=0;j<rowNum;j++)
            {
                worldMap.add(i+","+j);
            }
        }
        return worldMap;
    }

    public List<String> getAliveGraph()
    {
        List<String> aliveMap = new ArrayList<String>();
        for (int i=0;i<colNum;i++)
        {
            for (int j=0;j<rowNum;j++)
            {
                if (block[i][j])
                    aliveMap.add(i+","+j);
            }
        }
        return aliveMap;
    }

    public void setAliveGraph(List<String> aliveGraph)
    {
        for (String pos:aliveGraph)
        {
            for (int i=0;i<colNum;i++)
            {
                for (int j=0;j<rowNum;j++)
                {
                    if(aliveGraph.contains(i+","+j))
                           block[i][j] = true;
                    else
                           block[i][j] = false;
                }
            }
        }
    }

    public void print()
    {
        for (int i=0;i<colNum;i++)
        {
            for (int j=0;j<rowNum;j++)
            {
                if(block[i][j])
                {
                    System.out.print("活");
                }
                else {
                    System.out.print("死");
                }
            }
            System.out.print("\n");
        }
    }
}
