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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      ListNode temp=head;
       int c=1,count=0;
             ListNode p=null;
        if(left>1)
        {
            while(c<left-1 && temp!=null)
        {
          temp=temp.next; 
            c++;
        }
        }
        if(left==1)
        {
         c=1;   
        }
        if(left==1&& right==1)
            return head;
        if(left>1)
       {  p=temp.next;c=c+1;}
        else
      p=temp;   
        ListNode k=p,fir=null;int flag=0;
        ListNode l=null;
        
        while(c<=right && k!=null)
        {
            if(flag==0)
            {
                fir=p;
                flag=1;
            }
          k=k.next;
            p.next=l;
            l=p;
            p=k;
            c++;
        }
        
if(left==1)
        {fir.next=k; return l;}
        else
       {   fir.next=k ; 
        temp.next=l;}
       
        return head;
    }
}
