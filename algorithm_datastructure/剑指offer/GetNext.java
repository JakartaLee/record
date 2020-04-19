/**
	描述：求二叉树的中序遍历的下一个节点
	方法：这题还蛮难的，要分情况讨论一下，
	1.如果这个节点有右子树：则下一个节点是这个节点右子树的最左子节点
	2.如果这个节点没有右子树，且这个节点是其父节点的左子节点，则下一个节点是这个节点的父节点
	3.如果这个节点没有右子树，且这个节点是其父节点的右子节点，则由其父节点向上遍历，求得一个父节点是其父节点的左子节点，那么这么父节点的父节点就是下一个节点
*/

/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class GetNext {
    public TreeLinkNode getNext(TreeLinkNode pNode)
    {
        if (pNode == null) {
            return null;
        }
        TreeLinkNode pNext = null;
        if (pNode.right != null) {
            TreeLinkNode rightNode = pNode.right;
            while (rightNode.left != null) {
                rightNode = rightNode.left;
            }
            pNext = rightNode;
        } else if (pNode.next != null) {
            TreeLinkNode curNode = pNode;
            TreeLinkNode parentNode = pNode.next;
            while (parentNode != null && curNode == parentNode.right) {
                curNode = parentNode;
                parentNode = parentNode.next;
            }
            pNext = parentNode;
        }
        return pNext;
    }
}