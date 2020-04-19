/**
	描述：顺时针由外至内打印二维数组
	方法：找到规律不难，就是先从左至右，从上至下，从右至左，从下至上，依次循环；
*/
import java.util.ArrayList;
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int top = 0;
        while (true) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            if (--bottom < top) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }
}