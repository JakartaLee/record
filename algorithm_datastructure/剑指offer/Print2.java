/**
	描述：之字型打印二叉树
	方法：这题还是类似的，从上至下打印二叉树，这里注意怎么样控制哪个层以哪种顺序打印
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Print2 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(pRoot);
        while (!queue.isEmpty()) {
        ArrayList<Integer> list = new ArrayList<>();
            for (int i=queue.size(); i>0; i--) {
                TreeNode node = queue.removeFirst();
                list.add(node.val);
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            if (res.size() % 2 == 1) {
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }

}