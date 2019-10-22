package code;

import common.ListNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 访问单个节点的删除 {
    public boolean removeNode(ListNode pNode) {
        // write code here
        if (pNode.next == null) {
            return false;
        }
        pNode.val = pNode.next.val;
        pNode.next = pNode.next.next;
        return true;
    }
}
