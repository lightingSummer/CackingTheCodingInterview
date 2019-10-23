package code;

import common.TreeNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/23 0023
 * @description：
 */
public class 寻找下一个节点 {
    public int findSucc(TreeNode root, int p) {
        // write code here
        inOrder(root, p);
        return successor;
    }

    private int successor = -1;
    private boolean hasFinded = false;

    private void inOrder(TreeNode root, int p) {
        if (root == null) {
            return;
        }
        inOrder(root.left, p);
        if (hasFinded && successor == -1) {
            successor = root.val;
            return;
        }
        if (root.val == p) {
            hasFinded = true;
        }
        inOrder(root.right, p);
    }
}
