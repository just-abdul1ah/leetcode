import linkedList.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode first = list1.val <= list2.val ? list1 : list2;
        ListNode second = first.next;
        ListNode head = first;
        ListNode node = list1.val <= list2.val ? list2 : list1;
        while (second != null && node != null) {
            while (second != null && second.val <= node.val) {
                first = first.next;
                second = first.next;
            }
            first.next = node;
            ListNode temp = node.next;
            node.next = second;
            first = node;
            node = temp;
        }
        if (node == null) return head;
        first.next = node;
        return head;
    }
}
