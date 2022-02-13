// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        
    Stack<Integer> stk=new Stack<Integer>();
    for(int i=0;i<S.length();i++)
    {
        if(Character.isDigit(S.charAt(i)))
        {
            //System.out.println(S.charAt(i));
            stk.push(Integer.parseInt(String.valueOf(S.charAt(i))));
            
        }
        else
        {
            char cc=S.charAt(i);
           // System.out.println(cc);
          //  int a=stk.pop();
             //System.out.println(a);
            //if(stk.empty())
            //return a;
            //int b=stk.pop();
            //System.out.println(b);
            switch(cc)
            {
                case '+':
                    {
                          int a=stk.pop();
                            int b=stk.pop();
                        int c=a+b;
                        stk.push(c);
                        break;
                    }
                    case '/':
                    {
                        int a=stk.pop();
                            int b=stk.pop();
                       int c=b/a;
                        stk.push(c);
                        break;
                    }
                    case '*':
                    {
                        int a=stk.pop();
                            int b=stk.pop();
                      int c=a*b;
                        stk.push(c);
                        break;
                    }
                    case '-':
                    {
                        int a=stk.pop();
                            int b=stk.pop();
                        int c=b-a;
                        stk.push(c);
                    }
            }
            //System.out.println(stk);
        }
    }
    return stk.pop();
    }
}
