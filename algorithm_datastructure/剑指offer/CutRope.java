/**
	描述：剪绳子
	方法：这里可以用动态规划来做，f(n) = max(f(i)*f(n-i))
	这里有个很重要的点，就是在求f(n)的时候，f(1),f(2),f(3)并不是简单的f(1),f(2),f(3)
*/

public class CutRope {
    public int cutRope(int target) {
        if(target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int[] res = new int[target+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        res[3] = 3;
        int max;
        for (int i = 4; i <= target; i++) {
            max = 0;
            for (int j = 1; j <= i/2; j++) {
                int result = res[j] * res[i-j];
                if (result > max) {
                    max = result;
                }
            }
            res[i] = max;
        }
        return res[target];
    }
}