/**
	描述：模拟一个栈可以以时间复杂度O(1)的方式得到栈中最小值
	方法：设立一个辅助栈，实时跟踪当前最小值
*/
import java.util.Stack;
import java.util.EmptyStackException;

public class MinStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node) {
        if (stack1.isEmpty() || node < stack2.peek()) {
            stack2.push(node);
        } else {
            stack2.push(stack2.peek());
        }
        stack1.push(node);
    }
    
    public void pop() {
        if (!stack1.isEmpty() && !stack2.isEmpty()) {
            stack1.pop();
            stack2.pop();
        } else {
               System.out.println("栈为空!");
        }
    }
    
    public int top() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }
        throw new EmptyStackException();
    }
    
    public int min() {
        if (!stack2.isEmpty()) {
             return stack2.peek();
        }
       throw new EmptyStackException();
    }
}