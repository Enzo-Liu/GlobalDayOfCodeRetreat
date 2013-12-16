import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Block {

    private boolean[][] world;
    private int colNum;
    private int rowNum;

    public Block()
    {
        world = new boolean[10][10];
        colNum = 10;
        rowNum = 10;
    }

    public static void main()
    {

    }


    public void setAliveCell(List<String> aliveCells)
    {
        for (int i=0;i<colNum;i++)
            for (int j=0;j<rowNum;j++)
                if(aliveCells.contains(i+","+j))
                    world[i][j] = true;
                else
                    world[i][j] = false;
    }

    public void print()
    {

    }
}
