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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(c%2!=0)
      return slow;
        else
            return slow.next;
    }
}
