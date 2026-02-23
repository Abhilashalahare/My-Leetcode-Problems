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
    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        
        ListNode b = before;
        ListNode a = after;


        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                b.next = temp;
                b = b.next;
            }else{
                a.next = temp;
                a = a.next;
            }
            temp = temp.next;
        }

        b.next = after.next;
        a.next = null;

        return before.next;



    }
}