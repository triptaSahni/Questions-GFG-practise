class Solution
{
    public static Node reverse(Node node, int k)
    {
    Node temp=null,t=null,head=node;
    while(head!=null)
    {
        Stack<Integer> stk=new Stack<Integer>();
        int i=0;
        while(i<k && head!=null)
        {
           stk.push(head.data);
           head=head.next;
           i++;
        }

        while(!stk.isEmpty())
        {
            
            if(temp==null)
            {
                Node n=new Node(stk.pop());
                temp=n;
                t=n;
            }
            else
            {
               Node n=new Node(stk.pop());
               t.next=n;
               t=n;
            }
        }
    }
        return temp;
    }
    }
