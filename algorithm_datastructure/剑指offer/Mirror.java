/**
  描述：求二叉树的镜像
  方法：将所有非叶子节点的左右节点互换即可
*/

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
public class Mirror {
    public void mirror(TreeNode root) {
        recursion(root);
    }
    public TreeNode recursion(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode leftNode = recursion(root.left);
        TreeNode rightNode = recursion(root.right);
        root.left = rightNode;
        root.right = leftNode;
        return root;
    }
}
