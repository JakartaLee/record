/**
    描述：求链表中倒数第k个节点
    方法：这题思路还是蛮简单的，但是要特别注意鲁棒性，很容易出现空指针异常，然后怎么处理k值过大的问题
*/

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode preNode = head;
        ListNode postNode = head;
        while (k > 1 && preNode != null) {
            preNode = preNode.next;
            k--;
        }
        if (preNode == null) {
            return null;
        }
        while (preNode.next != null) {
            preNode = preNode.next;
            postNode = postNode.next;
        }
        return postNode;
    }
}
