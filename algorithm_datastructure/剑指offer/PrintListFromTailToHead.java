/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
/**
	描述：二叉树的逆序输出
	第一种方法是利用栈的先进后出的规则
*/
import java.util.ArrayList;
import java.util.Stack;
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curNode = listNode;
        while (curNode != null) {
            stack.push(curNode.val);
            curNode = curNode.next;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }
}

/**
第二种方法是利用递归
*/

/**

import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return res;
        }
        ArrayList<Integer> cur = printListFromTailToHead(listNode.next);
        cur.add(listNode.val);
        return cur;
    }
}
*/