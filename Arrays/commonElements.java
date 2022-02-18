// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        
        
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<A.length;i++)
        {
            if(i==0)
            hm.put(A[i],1);
            else if(A[i]==A[i-1])
            {
                continue;
            }
            else
            hm.put(A[i],1);
        }
        for(int i=0;i<B.length;i++)
        {
            if(hm.containsKey(B[i])==true && hm.get(B[i])==1)
            {
                hm.put(B[i],2);
             
            }
        }
            for(int i=0;i<C.length;i++)
        {
            if(hm.containsKey(C[i])==true && hm.get(C[i])==2)
            {
                hm.put(C[i],3);
             
            }
        } 
      for(Map.Entry m:hm.entrySet())
        {
           if((int)m.getValue()>=3)
            al.add((int)m.getKey());
        }
        Collections.sort(al);
        return al;
        
     }
     }
     
    
     
     
   /* 
     class Solution
{
   ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
   {
       // code here 
       int i = 0,j = 0, k = 0;
       ArrayList<Integer> result = new ArrayList<Integer>();
       
       while(i<n1 && j<n2 && k<n3){
           if(A[i] < B[j] || A[i] < C[k]){
               i++;
               continue;
           }
           if(A[i] > B[j]){
               j++;
           }else if(A[i] > C[k]){
               k++;
               ;
           }else if (A[i] == B[j] && A[i] == C[k]){
               if (!result.contains(A[i])) result.add(A[i]);
               i++;j++;k++;
               
           }
       }
       
       return result;
   }
}
*/
