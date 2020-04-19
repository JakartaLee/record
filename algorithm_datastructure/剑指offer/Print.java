/**
	描述：从上到下打印二叉树，其中每一行打印到一块去
	方法：有一道和这差不多的题目，参考那个就可以了
*/



import java.util.ArrayList;
import java.util.LinkedList;


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
public class Print {
    ArrayList<ArrayList<Integer> > print(TreeNode pRoot) {
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
            res.add(list);
        }
        return res;
    }
    
}