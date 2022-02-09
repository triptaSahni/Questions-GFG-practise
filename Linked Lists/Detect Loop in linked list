class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head,fast=head;
        if(head==null)
        return false;
        while(fast!=null)
        {
            slow=slow.next;
            if(fast.next==null)
            return false;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }
}
