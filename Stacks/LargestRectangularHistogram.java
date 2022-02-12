// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long nse[]=nse(hist,n);
        long pse[]=pse(hist,n);
      long max=0;
        //ArrayList<Long> al=new ArrayList<Long>();
        for(int i=0;i<n;i++)
        {
            long ans=(hist[i]*(nse[i]-pse[i]-1));
        if(ans>=max)
        max=ans;
        }
        //Collections.sort(al);
        return max;
    }
    static long[] nse(long hist[],long n)
    {
      Stack<Integer> stk=new Stack<Integer>();
      long nse[]=new long[(int)n];
      stk.push(0);
      for(int i=1;i<n;i++)
      {
          while(stk.empty()==false&& hist[stk.peek()]>hist[i])
          nse[stk.pop()]=i;
          stk.push(i);
          
      }
      while(stk.empty()==false)
     nse[stk.pop()]=n;
      return nse;
    }
    static long[] pse(long hist[],long n)
    {
        Stack<Integer> stk=new Stack<>();
    long pse[]=new long[(int)n];
    stk.push(0);
    pse[0]=-1;
    for(int i=1;i<n;i++)
    {
        while(stk.empty()==false && hist[stk.peek()]>=hist[i])
        stk.pop();
        if(stk.empty()==false&& hist[stk.peek()]<hist[i])
        pse[i]=stk.peek();
        else
      pse[i]=-1;
        stk.push(i);
    }
    return pse;
    }
        
}



