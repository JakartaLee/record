/**
	描述：从一个数组中找到是否存在某一个路径
	方法：典型的回溯问题
*/


public class HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        char[][] array = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = matrix[i*cols+j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPath(array,i,j,0,str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasPath(char[][] array, int i, int j, int k, char[] str) {
        if (i >= array.length || i < 0 || j < 0 || j >= array[0].length || array[i][j] != str[k]) {
            return false;
        }
        if (k == str.length - 1) {
            return true;
        }
        char temp = array[i][j];
        array[i][j] = '#';
        boolean res = hasPath(array, i + 1, j, k + 1, str) || hasPath(array, i - 1, j, k + 1, str) ||
                hasPath(array, i, j - 1, k + 1, str) || hasPath(array, i, j + 1, k + 1, str);
        array[i][j] = temp;
        return res;
    }


}