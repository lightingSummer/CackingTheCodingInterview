package code;

import common.ListNode;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 链式A加B {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        int carryBit = 0;
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while (a != null || b != null) {
            int val1 = a == null ? 0 : a.val;
            int val2 = b == null ? 0 : b.val;
            cur.next = new ListNode((val1 + val2 + carryBit) % 10);
            carryBit = (val1 + val2 + carryBit) / 10;
            cur = cur.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
        if (carryBit != 0) {
            cur.next = new ListNode(carryBit);
        }
        return newHead.next;
    }
}
