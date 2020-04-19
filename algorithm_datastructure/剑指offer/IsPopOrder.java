/**
	描述：根据压栈顺序，判断一个序列是否可能是弹栈顺序
	方法：这个思路是很清晰的，主要是怎么着能写出来，还是得多联系啊
*/

import java.util.Stack;

public class IsPopOrder {
    public static boolean isPopOrder(int [] pushA,int [] popA) {
        boolean res = false;
        int length = pushA.length;
        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        while (i < length) {
			// 这一步比较关键,不能用if得用while
            while (stack.isEmpty() || stack.peek() != popA[i]) {
                if (j == length) {
                    break;
                }
                stack.push(pushA[j++]);
            }

            if (stack.peek() != popA[i]) {
                break;
            }
            stack.pop();
            i++;
        }
        if (i == length) {
            res = true;
        }
        return res;
    }
}