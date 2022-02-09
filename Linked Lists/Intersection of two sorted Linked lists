class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        ArrayList<Integer> hs1=new ArrayList<Integer>();
        ArrayList<Integer> hs2=new ArrayList<Integer>();
        Node temp1=head1,temp2=head2,start=null,m=null,t1=null,t2=null;int flag=0, c1=0,c2=0;
        while(temp1!=null)
        {
            if(hs1.contains(temp1.data)==false)
            hs1.add(temp1.data);
            temp1=temp1.next;
            c1++;
        }
        while(temp2!=null)
        {
              if(hs2.contains(temp2.data)==false)
            hs2.add(temp2.data);
            temp2=temp2.next;
            c2++;
        }
        if(c1<c2)
        {
            for(int i=0;i<hs1.size();i++)
            {
                if(hs2.contains(hs1.get(i)))
                {
                    if(flag==0)
                   { 
                       Node n=new Node(hs1.get(i));
                       start=n;
                       m=n;flag=1;
                   }
                   else
                   {
                       Node n=new Node(hs1.get(i));
                       m.next=n;
                       m=m.next;
                   }
                }
            }
           
        }
        else
        {
           for(int i=0;i<hs2.size();i++)
            {
                if(hs1.contains(hs2.get(i)))
                {
                    if(flag==0)
                   { 
                       Node n=new Node(hs2.get(i));
                       start=n;
                       m=n;flag=1;
                   }
                   else
                   {
                       Node n=new Node(hs2.get(i));
                       m.next=n;
                       m=m.next;
                   }
                }
            }
           
        }
        return start; 
    }
}
