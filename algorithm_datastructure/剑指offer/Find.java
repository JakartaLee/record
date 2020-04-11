/**
从一个二维数组中找一个数
这个二维数组从上至下，从左至右都是递增的
*/
public class Find {
    public boolean find(int target, int [][] array) {
        int i = array.length - 1;
        int j = 0;
        
        while (i >= 0 && j < array[0].length) {
            if (array[i][j] < target) {
                j++;
            } else if (array[i][j] > target) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }
}