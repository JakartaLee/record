/**
	描述：求在数组中的运动范围
	方法：和求数组中是否含有某一条路径其实是一个东西，或者说还更简单的，这里无非是从固定点出发
*/

public class MovingCount {
   int count = 0;
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] isVisited = new boolean[rows][cols];
        movingCount(threshold, 0, 0, rows, cols, isVisited);
        return count;
    }

    public boolean movingCount(int threshold, int i, int j, int rows, int cols, boolean[][] isVisited) {
        if (i >= rows || i < 0 || j < 0 || j >= cols || sum(i,j) > threshold || isVisited[i][j]) {
            return false;
        }
        count++;
        isVisited[i][j] = true;
        return movingCount(threshold, i+1, j, rows, cols,isVisited) || movingCount(threshold, i-1, j, rows, cols, isVisited) ||
                movingCount(threshold, i, j-1, rows, cols,isVisited) || movingCount(threshold, i, j+1, rows, cols, isVisited);

    }

    public int sum(int i, int j) {
        return i % 10 + i / 10 + j % 10 + j / 10;
    }
}