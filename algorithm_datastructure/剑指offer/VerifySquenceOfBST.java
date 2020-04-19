/**
	描述：判断一个序列是否可能是BST的后序遍历序列
	方法：这题和前面根据前序序列中序序列生成二叉树的逻辑是一样的，要把我遍历序列中左子树，右子树，根节点的位置，再用递归去遍历
*/

public class VerifySquenceOfBST {
    public boolean verifySquenceOfBST(int [] sequence) {
        return recursion(sequence, 0, sequence.length - 1);
    }
    public boolean recursion(int[] sequence, int i, int j) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        if (i >= j) {
            return true;
        }
        int m = i;
        while (sequence[m] < sequence[j]) {
            m++;
        }
        int n = m;
        while (sequence[n] > sequence[j]) {
            n++;
        }
        return n == j && recursion(sequence, i, m-1) && recursion(sequence, n, j-1);
    }
}