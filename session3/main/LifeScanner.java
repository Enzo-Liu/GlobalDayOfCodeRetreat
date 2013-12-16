package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class LifeScanner {

    List<String> alivePosList;
    List<String> worldMap;

    public LifeScanner(List<String> alivePosList, List<String> worldMap) {
        this.alivePosList = alivePosList;
        this.worldMap = worldMap;
    }

    public int getAliveNeigh(String curPos) {
        int aliveNum = 0;
        int colIndex = Integer.valueOf(curPos.split(",")[0]);
        int rowIndex = Integer.valueOf(curPos.split(",")[1]);
        for (int i=colIndex-1;i<=colIndex+1;i++)
        {
            for (int j=rowIndex-1;j<=rowIndex+1;j++)
            {
                String pos = i+","+j;
                if (!pos.equals(curPos))
                    aliveNum = alivePosList.contains(pos)?aliveNum+1:aliveNum;
            }
        }
        return aliveNum;
    }

    public boolean decideAlive(boolean curStatus, int aliveNeigh) {
        if (curStatus)
            return aliveNeigh==2||aliveNeigh==3;
        else
            return aliveNeigh==3;
    }

    public List<String> genAliveGraph() {
        List<String> aliveGraph  = new ArrayList<String>();
        for (String pos:worldMap)
        {
            if (decideAlive(alivePosList.contains(pos),getAliveNeigh(pos)))
            {
                aliveGraph.add(pos);
            }
        }
        alivePosList = aliveGraph;
        return aliveGraph;
    }
}
