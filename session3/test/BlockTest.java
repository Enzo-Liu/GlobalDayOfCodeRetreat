package test;

import junit.framework.Assert;
import main.Block;
import main.LifeScanner;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlockTest {

    @Test
    public void test_init()
    {
        Block block = new Block(10,10);
        LifeScanner lifeScanner = new LifeScanner(block.getAliveGraph(),block.getWorldMap());
        block.print();
        block.setAliveGraph(lifeScanner.genAliveGraph());
        block.print();
        block.setAliveGraph(lifeScanner.genAliveGraph());
        block.print();
        block.setAliveGraph(lifeScanner.genAliveGraph());
        block.print();
        block.setAliveGraph(lifeScanner.genAliveGraph());
        block.print();
        block.setAliveGraph(lifeScanner.genAliveGraph());
    }

}
