/**

	描述：变态跳台阶：一次可以跳任意步，问调到第n个台阶一共有多少种方法
*/
public class JumpFloorII {
    public int jumpFloorII(int target) {
        int oneNum = 1;
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return oneNum;
        }
        int res = 0;
        for (int i = 2; i <= target; i++) {
            res = 2 * oneNum;
            oneNum = res;
        }
        return res;
    }
}