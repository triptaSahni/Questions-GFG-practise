// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> stk=new Stack<>();
    	for(int i=0;i<M.length;i++)
    	{
    	    stk.push(i);
    	}
    	int b1=0,b2=0;
    	while(stk.size()!=1)
    	{
    	    b1=stk.pop();
    	    b2=stk.pop();
    	    if(M[b1][b2]==1)
    	    {
    	        stk.push(b2);
    	    }
    	    else
    	    {
    	        stk.push(b1);
    	    }
    	}
    	int potCeleb=stk.pop();
    	for(int i=0;i<M.length;i++)
    	{
    	   if(M[potCeleb][i]!=0)
    	   {
    	       return -1;
    	   }
    	}
    	for(int i=0;i<M[0].length;i++)
    	{
    	    if(i!=potCeleb && M[i][potCeleb]!=1)
    	    return -1;
    	}
    	return potCeleb;
    }
}
