package code;

import common.TreeNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/23 0023
 * @description：
 */
public class 检查是否为BST {
    private TreeNode pre = new TreeNode(Integer.MIN_VALUE);

    public boolean checkBST(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        boolean leftCheck = checkBST(root.left);
        if (!leftCheck) {
            return false;
        }
        if (pre.val >= root.val) {
            return false;
        }
        pre = root;
        return checkBST(root.right);
    }
}
