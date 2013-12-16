package test;

import junit.framework.Assert;
import main.LifeScanner;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class LifeScannerTest {

    LifeScanner lifeScanner;
    @Before
    public void setup()
    {
        List<String> alivePosList = new ArrayList<String>();
        String alivePos = "1,1";
        List<String> worldMap = new ArrayList<String>();
        worldMap.add("0,0");worldMap.add("0,1");worldMap.add("1,1");
        alivePosList.add(alivePos);
        lifeScanner = new LifeScanner(alivePosList,worldMap);
    }
    @Test
    public void test_getAliveNeigh()
    {


        Assert.assertTrue(lifeScanner.getAliveNeigh("0,0")==1);
    }

    @Test
    public void test_decideAlive()
    {
        Assert.assertTrue(lifeScanner.decideAlive(true,3)==true);
        Assert.assertTrue(lifeScanner.decideAlive(true,1)==false);
        Assert.assertTrue(lifeScanner.decideAlive(false,1)==false);
        Assert.assertTrue(lifeScanner.decideAlive(false,3)==true);
    }

    @Test
    public void test_genAliveGraph()
    {
        Assert.assertTrue(lifeScanner.genAliveGraph().isEmpty());
    }

    @Test
    public void test_genAliveGraph_withAlive()
    {
        List<String> alivePosList = new ArrayList<String>();
        List<String> worldMap = new ArrayList<String>();
        worldMap.add("0,0");worldMap.add("0,1");worldMap.add("1,1");
        worldMap.add("1,0");
        alivePosList.add("1,1");
        alivePosList.add("0,1");
        alivePosList.add("1,0");
        LifeScanner lifeScanner2 = new LifeScanner(alivePosList,worldMap);
        Assert.assertTrue(lifeScanner2.genAliveGraph().size()==4);
        Assert.assertTrue(lifeScanner2.genAliveGraph().size()==4);
    }
}
