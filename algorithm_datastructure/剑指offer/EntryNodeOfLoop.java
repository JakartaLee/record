/**
	描述：链表中环的入口
	方法：首先找到环中节点个数，然后设置前后指针到相遇！
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
public class EntryNodeOfLoop {

    public ListNode entryNodeOfLoop(ListNode pHead)
    {
        int num = numOfLoop(pHead);
        if (num == 0) {
            return null;
        }
        ListNode preNode = pHead;
        ListNode postNode = pHead;
        while (num > 0) {
            preNode = preNode.next;
            num--;
        }
        while (preNode != postNode) {
            preNode = preNode.next;
            postNode = postNode.next;
        }
        return preNode;
    }
    
    public int numOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return 0;
        }
        ListNode quickNode = pHead.next;
        ListNode slowNode = pHead;
        while (slowNode != quickNode) {
            if (quickNode.next == null) {
                return 0;
            }
            slowNode = slowNode.next;
            quickNode = quickNode.next.next;
        }
        int count = 1;
        ListNode curNode = slowNode.next;
        while (curNode != slowNode) {
            curNode = curNode.next;
            count++;
        }
        return count;
    }
}