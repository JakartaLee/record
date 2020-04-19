/**
	描述：求二叉树中和为某个数的路径
	方法：树的深度遍历，这个删除最后一个节点还是蛮难想象的。
*/

import java.util.ArrayList;
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
public class FindPath {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
        recursion(root, target);
        return res;
    }
    
    public void recursion(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        target -= root.val;
        list.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
        }
        recursion(root.left, target);
        recursion(root.right, target);
        list.remove(list.get(list.size()-1));
    }
}