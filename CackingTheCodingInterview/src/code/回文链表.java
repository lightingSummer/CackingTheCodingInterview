package code;

import common.ListNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/22 0022
 * @description：
 */
public class 回文链表 {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if (pHead == null) {
            return false;
        }
        if (pHead.next == null) {
            return true;
        }
        ListNode slow = pHead, fast = pHead, pre = pHead;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        pre = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }

        while (pHead != null && pre != null) {
            if (pHead.val != pre.val) {
                return false;
            }
            pHead = pHead.next;
            pre = pre.next;
        }
        return true;
    }
}
