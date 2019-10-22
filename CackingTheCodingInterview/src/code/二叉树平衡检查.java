package code;

import common.TreeNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/22 0022
 * @description：
 */
public class 二叉树平衡检查 {
    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        }
        return getTreeHeight(root) != -1;
    }

    private int getTreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getTreeHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = getTreeHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        return Math.abs(leftHeight - rightHeight) > 1 ? -1 : Math.max(leftHeight, rightHeight) + 1;
    }
}
