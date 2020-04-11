/**

	描述：跳台阶问题，一次只能调一个台阶或者两个台阶，跳上第n个台阶一共有多少种跳法
*/
public class JumpFloor {
    public int jumpFloor(int target) {
        int oneNum = 1;
        int twoNum = 2;
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return oneNum;
        }
        if (target == 2) {
            return twoNum;
        }
        int sum = 0;
        for (int i = 3; i <= target; i++) {
            sum = oneNum + twoNum;
            oneNum = twoNum;
            twoNum = sum;
        }
        return sum;
    }
}