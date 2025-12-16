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
            if (kth == null) {//2 cases, i)if size is smaller than kth, ii)at last finding kth is not possible bcos no kth group is left
                if (prev !=  null) {
                 prev.next = temp;//ii)case //because temp reverse hi ni hua, qki reverse krne k liye k group bcha hi nhi
                } //if prev node is there, then only connect it to next head which is temp
                break;//i)case //in case of ll of size 2, prev node is pointing to null, becoz no kth node was found as k=3, so we have no group of size k, break and at least return head;
            }
        

        ListNode nextNode = kth.next;//preverse next node
        kth.next = null;//break node
        reverse(temp);
        
        if(temp == head){//at first time 
            head = kth;
        }else{
            // on reversing kth comes at first, so prev next connected to first node of next group
         
            prev.next = kth;
        }
        // ṭemp starting tha, on reversing it became last, so prev will point to next group's lastnode
         prev = temp;
        //  temp will point to start node of another group
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