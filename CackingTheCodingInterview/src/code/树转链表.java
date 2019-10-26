package code;

import common.ListNode;
import common.TreeNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/25 0025
 * @description：
 */
public class 树转链表 {
    public ListNode treeToList(TreeNode root) {
        // write code here
        inOrderVisit(root);
        return head;
    }

    private ListNode pre = null;
    private ListNode head = null;

    private void inOrderVisit(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderVisit(root.left);
        if (head == null) {
            head = new ListNode(root.val);
            pre = head;
        } else {
            pre.next = new ListNode(root.val);
            pre = pre.next;
        }
        inOrderVisit(root.right);
    }
}
