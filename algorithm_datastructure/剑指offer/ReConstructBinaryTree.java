/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 /**
 
	描述：根据二叉树的前序遍历序列和中序遍历序列重建二叉树
	
 */
 /**
 
 本题还是很难的，在二叉树中递归和回溯用的却是很多啊，这里就用到了
 */
import java.util.HashMap;
public class ReConstructBinaryTree {
    int[] tmp;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        tmp = pre;
        for (int i = 0; i < in.length; i++) {
            map.put(in[i],i);
        }
        TreeNode root = recursion(0, 0, in.length-1);
        return root;
    }
    
    public TreeNode recursion(int preRoot, int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }
        TreeNode root = new TreeNode(tmp[preRoot]);
        int i = map.get(tmp[preRoot]);
        root.left = recursion(preRoot+1, inLeft, i-1);
        root.right = recursion(i-inLeft+preRoot+1, i+1, inRight);
        return root;
    }
}