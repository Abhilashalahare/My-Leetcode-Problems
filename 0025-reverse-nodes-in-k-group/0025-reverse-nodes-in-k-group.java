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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode kth = findKthNode(temp, k);
            if (kth == null) {
                if (prev !=  null) {
                    prev.next = temp;
                } //if prev node is there, then only connect it to next head which is temp
                break;
            }
        

        ListNode nextNode = kth.next;
        kth.next = null;
        reverse(temp);
        
        if(temp == head){
            head = kth;
        }else{
            prev.next = kth;
        }

         prev = temp;
         temp = nextNode;
        }

         return head;

    }

    public ListNode reverse(ListNode temp){
        ListNode curr=temp;
        ListNode prev = null;

        while(curr != null){
            ListNode front = curr.next;
            curr.next = prev;
            prev=curr;
            curr=front;

        }
        return prev;
    }

    public ListNode findKthNode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
}