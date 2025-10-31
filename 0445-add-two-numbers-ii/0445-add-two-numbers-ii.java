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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        ListNode temp = null; //start from back, eg - [7->null],[0->7->null] , add in front  
        int carry =0;

          while (!s1.empty() || !s2.empty()) {
            int sum = carry;
            if (!s1.empty()) {
                sum += s1.pop();
            }
            if (!s2.empty()) {
                sum += s2.pop();
            }

            ListNode newNode = new ListNode(sum%10);
            carry = sum/10;

            //to add in front
            newNode.next = temp; //newNode.next = null as temp is null initially
            temp = newNode;
             

          }

          if(carry>0){
             ListNode newNode = new ListNode(carry);
             newNode.next = temp;
             temp = newNode;
          }

          return temp;
    }
}