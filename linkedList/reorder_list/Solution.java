import linkedList.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null) return;

        // find the middle
        ListNode slow = head;
        ListNode fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half
        ListNode begin = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (begin != null) {
            ListNode tmp = begin.next;
            begin.next = prev;
            prev = begin;
            begin = tmp;
        }

        // merge two portions
        ListNode end = prev;
        ListNode start = head;
        while (end != null) {
            ListNode tmp = start.next;
            start.next = end;
            ListNode tmp2 = end.next;
            end.next = tmp;
            start = tmp;
            end = tmp2;
        }
    }
}
