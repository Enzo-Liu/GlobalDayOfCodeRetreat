import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class LifeScannerTest {

    @Test
    public void test_getAliveNeigh()
    {
        String pos = "1,1";
        List<String> aliveMap = new ArrayList<String>();
        aliveMap.add("0,0");aliveMap.add("0,1");aliveMap.add("1,0");
        List<String> allMap = new ArrayList<String>();
        allMap.add("0,0"); allMap.add("0,1");allMap.add("1,0");allMap.add("1,1");allMap.add("1,2");
        allMap.add("2,1"); allMap.add("2,2");allMap.add("2,0");allMap.add("0,2");
        LifeScanner scanner = new LifeScanner(aliveMap);
        Assert.assertTrue(scanner.getAliveNeigh(pos)==3);
    }

    @Test
    public void test_isAlive()
    {

    }

    @Test
    public void test_getAliveGraph()
    {

    }
}
