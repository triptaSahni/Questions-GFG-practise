// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here

        Collections.sort(a);
        ArrayList<Long> al=new ArrayList<Long>();
        //System.out.println(a);
        for(int i=0;i<=n-m;i++)
        {
           al.add((a.get(i+(int)m-1)-a.get(i))); 
           //System.out.println(al);
        }
        Collections.sort(al);
        return al.get(0);
        
    }
}
