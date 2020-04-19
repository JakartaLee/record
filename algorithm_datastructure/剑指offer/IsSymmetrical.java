/**
	描述：判断二叉树是否是对称的二叉树
	方法：根据前序遍历设置前序遍历的对称遍历法：先到根节点，再到右子节点，最后到左子节点。
*/



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
public class IsSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return isSymmetrical(pRoot, pRoot);
    }
    boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot1 == null && pRoot2 == null) {
            return true;
        }
        if (pRoot1 == null || pRoot2 == null) {
            return false;
        }
        
        if (pRoot1.val != pRoot2.val) {
            return false;
        }
        return isSymmetrical(pRoot1.left, pRoot2.right) && isSymmetrical(pRoot1.right, pRoot2.left);
    }
}