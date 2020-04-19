/**
	描述：从上到下打印二叉树，同一层的节点由左到右打印
	方法：这题还是有技巧的，把每一个节点的的左右子节点加入到队列中
*/

import java.util.ArrayList;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class PrintFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.addLast(root);
        while (!list.isEmpty()) {
            TreeNode node = list.removeFirst();
            if (node.left != null) {
                list.addLast(node.left);
            }
            if (node.right != null) {
                list.addLast(node.right);
            }
            res.add(node.val);
        }
        return res;
    }
}