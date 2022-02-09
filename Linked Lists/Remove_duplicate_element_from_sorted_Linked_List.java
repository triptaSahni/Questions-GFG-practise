class GfG
{
    //Function to remove duplicates from sorted linked list.
    
    Node removeDuplicates(Node head)
    {
       Node temp=head,tempy=null,start=null;
        Node t=new Node(temp.data);
    tempy=t;
    start=t;
        
        while(temp.next!=null)
        {
            if(temp.data!=temp.next.data)
            {
                Node tt=new  Node(temp.next.data);
                tempy.next=tt;
                tempy=tempy.next;
                temp=temp.next;
             }

            else
            {
                temp=temp.next;
            }
        }
	// Your code here
	return start;
    }
}
