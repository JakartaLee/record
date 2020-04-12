/**
  描述：反转链表，并输出链表头
  方法：这个是很明显可以用回溯实现的，还蛮有意思的
*/

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
