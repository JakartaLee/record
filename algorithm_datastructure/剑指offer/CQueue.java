import java.util.Stack;

/**
	描述：用两个栈实现队列的出列和进列功能
	本题还是要掌握规律啊，规律一时不好找哦，慢慢摸索吧
*/
public class CQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException();
        }
        return stack2.pop();
    }
}