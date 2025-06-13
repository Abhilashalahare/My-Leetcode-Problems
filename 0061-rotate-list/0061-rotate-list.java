/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Compute the length
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        // Step 2: Connect the tail to head (make it circular)
        temp.next = head;

        // Step 3: Find the new tail (at len - k % len - 1)
        k = k % len;
        int stepsToNewTail = len - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 4: Set the new head and break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
