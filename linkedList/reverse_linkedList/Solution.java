public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;
        while (second != null) {
            first.next = prev;
            prev = first;
            first = second;
            second = first.next;
        }
        first.next = prev;
        return first;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}