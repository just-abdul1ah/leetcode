import linkedList.ListNode;

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
}