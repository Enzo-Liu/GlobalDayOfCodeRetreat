package test;

import junit.framework.Assert;
import main.LifeScanner;
import org.junit.Test;

/**
 Any live cell with fewer than two live neighbours dies, as if caused by under-population.
 Any live cell with two or three live neighbours lives on to the next generation.
 Any live cell with more than three live neighbours dies, as if by overcrowding.
 Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 */
public class LifeScannerTest {

    @Test
    public void test_findNeigh()
    {
        boolean[][] block = new boolean[10][10];
        LifeScanner lifeScanner = new LifeScanner(block);
        block[0][1] = true;
        Assert.assertTrue(lifeScanner.getAliveNeigh(0,0)==1);
    }

    @Test
    public void test_decideLife()
    {
        //int aliveNum = 4;
        boolean[][] block = new boolean[10][10];
        LifeScanner lifeScanner = new LifeScanner(block);
        Assert.assertTrue(lifeScanner.decideLife(true, 1)==false);
        Assert.assertTrue(lifeScanner.decideLife(true, 2)==true);
        Assert.assertTrue(lifeScanner.decideLife(true, 3)==true);
        Assert.assertTrue(lifeScanner.decideLife(true, 4)==false);
        Assert.assertTrue(lifeScanner.decideLife(false, 3)==true);
        Assert.assertTrue(lifeScanner.decideLife(false, 0)==false);
//        Assert.assertTrue(lifeScanner.decideLife(false, aliveNum)==false);
//        aliveNum =2;
//        Assert.assertTrue(lifeScanner.decideLife(aliveNum)==true);
        //Boolean[][] block = new Boolean[][];
    }

    @Test
    public void test_genNextGraph()
    {
        boolean[][] block = new boolean[10][10];
        LifeScanner lifeScanner = new LifeScanner(block);
        block[0][1] = true;
        Assert.assertTrue(lifeScanner.genNextGraph() all false);
    }
}
