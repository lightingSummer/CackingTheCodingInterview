package code;

import common.ListNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 链表分割 {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode smallHead = new ListNode(-1);
        ListNode bigHead = new ListNode(-1);
        ListNode smallCurrent = smallHead, bigCurrent = bigHead;
        while (pHead != null) {
            if (pHead.val < x) {
                smallCurrent.next = pHead;
                smallCurrent = smallCurrent.next;
            } else {
                bigCurrent.next = pHead;
                bigCurrent = bigCurrent.next;
            }
            bigCurrent.next = null;
            pHead = pHead.next;
        }
        smallCurrent.next = bigHead.next;
        return smallHead.next;
    }
}
