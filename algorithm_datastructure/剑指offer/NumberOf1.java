/**

	描述：二进制中1的个数
	方法：对二进制处理的时候有一个很重要的规律：n和n-1做与位运算等于去掉n最右边的一个1
*/
public class NumberOf1 {
    public int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}