class Solution
{
    public static int call(Node head){
        if(head==null){
            return 1;
        }
        int sum=head.data+call(head.next);
        head.data=sum%10;
        return sum/10;
    }
    public static Node addOne(Node head) 
    { 
        int ree=call(head);
        if(ree>0){              ///if number=99 it should become 100
            Node n=new Node(ree);
            n.next=head;
            head=n;
        }
        return head;
    }
}
/*

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        Node temp=head;
        Stack<Integer> stk=new Stack<Integer>();
        int s=0,c=0;
        Node nn=null,mm=null;
        while(temp!=null)
        {
            stk.push(temp.data);
            if(temp.data==9)
            s++;
            c++;
            temp=temp.next;
        }
       
            if(s!=c && stk.peek()!=9)
            {
                Node n=new Node(stk.pop()+1);
             
                mm=n;
                while(stk.isEmpty()==false)
                {
                    Node nm=new Node(stk.pop());
                    nn=nm;
                  nn.next=mm;
                  mm=nn;
                  
                }
              
            }
            
            else if(s!=c && stk.peek()==9)
            {
                Node n=new Node(0);
                
                mm=n;
                stk.pop();
               while(stk.isEmpty()==false && stk.peek()==9)
               {
                    n=new Node(0);
                   nn=n;
                   nn.next=mm;
                   mm=nn;
                  
                  stk.pop();
               }
                n=new Node(stk.pop()+1);
               nn=n;
               nn.next=mm;
               mm=nn;
              
               while(stk.isEmpty()==false)
               {
                 n=new Node(stk.pop());
                 nn=n;
                 nn.next=mm;
                 mm=nn;
                
               }
              
            }
            else if(s==c)
            {
                 
                 Node n=new Node(0);
                 mm=n;
                 stk.pop();
                 c--;
                 while(stk.isEmpty()==false)
                 {
                     n=new Node(0);
                     nn=n;
                     nn.next=mm;
                     mm=nn;
                     c--;
                 }
                 n=new Node(1);
                 nn=n;
                 nn.next=mm;
                 mm=nn;
               
             }
            return mm; 
            }
    
}
*/

