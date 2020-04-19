/**
	描述：删除链表中重复的节点
	方法：这题也是设置双子针的问题，设置前后指针，容易搞烦了子针的前后顺序就做不出来了
*/


/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = pHead;
        ListNode node1 = pHead;
        ListNode node2 = head;
        while (node1 != null) {
            if (node1.next != null && node1.next.val == node1.val) {
                while (node1.next != null && node1.next.val == node1.val) {
                    node1 = node1.next;
                }
                node1 = node1.next;
                node2.next = node1;
            } else {
                node2 = node1;
                node1 = node1.next;
            }
        }
        return head.next;
    }
}