import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class LifeScanner {

    private List<String> aliveCells;

    private List<String> allCells;

    public LifeScanner(List<String> aliveMap,List<String> allMap) {
        aliveCells = aliveMap;
        allCells = allMap;
    }

    public int getAliveNeigh(String curPos) {
        int aliveNum = 0;
        for (String pos:getNeigh(getPos(curPos)))
            if(aliveCells.contains(pos))
                aliveNum++;
        return aliveNum;
    }

    private Integer[] getPos(String curPos) {
        Integer[] posArray = new Integer[2];
        posArray[0] = Integer.valueOf(curPos.split(",")[0]);
        posArray[1] = Integer.valueOf(curPos.split(",")[1]);
        return posArray;
    }

    private List<String> getNeigh(Integer[] curPos) {
        List<String> posList = new ArrayList<String>();
        for (int i =curPos[0]-1;i<=curPos[0]+1;i++)
            for (int j=curPos[1]-1;j<=curPos[1]+1;j++)
                if (!(i==curPos[0]&&j==curPos[1]))
                    posList.add(i+","+j);
        return posList;
    }

    public boolean decideAlive(boolean isAlive,int aliveNum)
    {
        if (isAlive)
            return aliveNum==2||aliveNum==3;
        else
            return aliveNum==3;
    }

    public boolean isNextTurnAlive(String pos)
    {
        boolean isNowAlive = aliveCells.contains(pos);
        int aliveNeigh = getAliveNeigh(pos);
        return decideAlive(isNowAlive,aliveNeigh);
    }

    public List<String> getAliveGraph()
    {
        List<String> aliveMap = new ArrayList<String>();
        for (String pos:allCells)
            if(isNextTurnAlive(pos))
                aliveMap.add(pos);
        aliveCells = aliveMap;
        return aliveMap;
    }
}
