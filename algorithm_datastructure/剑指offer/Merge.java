/**
  描述：合并两个递增的链表
  方法：不断比较链表的头部，使用递归的方法
*/

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Merge {
    public ListNode merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        ListNode root;
        if (list1.val < list2.val) {
            root = list1;
            root.next = Merge(list1.next, list2);
        } else {
            root = list2;
            root.next = Merge(list1, list2.next);
        }
        return root;
    }
    
}
