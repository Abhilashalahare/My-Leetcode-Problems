/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          ListNode temp;

        // Iterate through the nodes of the first linked list
        while (headA != null) {
            temp = headB;

            // Iterate through the nodes of the second linked list
            while (temp != null) {
                // If the current nodes are the same, we found the intersection
                if (headA == temp) {
                    return headA;
                }
                temp = temp.next;
            }

            // Move to the next node in the first linked list
            headA = headA.next;
        }

        // No intersection found
        return null;
    }
}