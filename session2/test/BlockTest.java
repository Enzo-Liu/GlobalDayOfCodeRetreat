package test;

import junit.framework.Assert;
import main.Block;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class BlockTest {

    @Test
    public void test_init()
    {
        int colNum = 10;int rowNum = 10;
        Block block = new Block(colNum,rowNum);
        Assert.assertTrue(block.height == colNum);
        Assert.assertTrue(block.width == rowNum);
    }


}
