package code;

import common.ListNode;
import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/22 0022
 * @description：
 */
public class 输出单层节点 {
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        if (dep == 1) {
            return new ListNode(root.val);
        }
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int step = 0, size = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            step++;
            if (step == size) {
                level++;
                if (level == dep) {
                    break;
                }
                step = 0;
                size = queue.size();
            }
        }
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while (!queue.isEmpty()) {
            cur.next = new ListNode(queue.poll().val);
            cur = cur.next;
        }
        return newHead.next;
    }
}
