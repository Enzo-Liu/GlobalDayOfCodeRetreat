package main;

/**
 * Created with IntelliJ IDEA.
 * User: liuenze
 * Date: 12/14/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class LifeScanner {

    private final boolean[][] block;

    private int getWidth() {
        return block[0].length;
    }

    private int getHeight() {
        return block.length;
    }



    public LifeScanner(boolean[][] block) {
        this.block = block;
    }

    public int getAliveNeigh(int x, int y) {
        int result = 0;
        for (int i=x-1;i<=x+1;i++)
        {
            if(i < 0 || i >= getWidth()) {
                continue;
            }
            for (int j=y-1;j<=y+1;j++)
            {
                if(j < 0 || j >= getHeight()) {
                    continue;
                }
                if(block[i][j] ) {
                    ++result;
                }
            }
        }
        return result;
    }

    public boolean decideLife(boolean current, int aliveNeigh) {
        if (current) {
            return aliveNeigh == 2 || aliveNeigh == 3;
        }else {
            return aliveNeigh == 3;
        }
    }
}
