/**

	描述：斐波那契数列的第n项
	方法：没什么好说的，很简单的问题
*/
public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        
        int oneNum = 1;
        int twoNum = 1;
        if (n == 1) {
            return oneNum;
        }
        if (n == 2) {
            return twoNum;
        }
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = oneNum + twoNum;
            oneNum = twoNum;
            twoNum = sum;
        }
        return sum;
    }
}