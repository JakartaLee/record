/**
  描述：判断B是否是A的子结构
  方法：用递归的方式遍历
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
public class HasSubtree {
    public boolean hasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                res = Tree1HasTree2(root1,root2);
            }

            if (!res) {
                res = hasSubtree(root1.left,root2);
            }
            if (!res) {
                res = hasSubtree(root1.right,root2);
            }
        }
        return res;
    }
    
    public boolean Tree1HasTree2(TreeNode root1, TreeNode root2) {
         // 注意这里，因为只是子结构并非子树
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return Tree1HasTree2(root1.left, root2.left) && Tree1HasTree2(root1.right, root2.right);
    }
}
