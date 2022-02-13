// { Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
            int ht[]=new int[m],s=0;
            int maxA=Integer.MIN_VALUE;
           ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<m;j++)
             {
                 if(M[i][j]==0)
                 ht[j]=0;
                 else
                 ht[j]+=M[i][j];
             }
             
             int nse[]=nse(ht);
             int pse[]=pse(ht);
            //   for(int kk=0;kk<m;kk++)
            //  {
            //      System.out.println(pse[kk]);
            //  }
            //   System.out.println("-----------");
            //   for(int kk=0;kk<m;kk++)
            //  {
            //      System.out.println(nse[kk]);
            //  }
             for(int k=0;k<m;k++)
             {
                 s=ht[k]*(nse[k]-pse[k]-1);
                 if(s>maxA)
                 maxA=s;
                 //System.out.println(s);
                 
             }
             al.add(maxA);
    maxA=Integer.MIN_VALUE;
        }
        Collections.sort(al);
        //System.out.println(al);
        return al.get(al.size()-1);
             
            
        }
        int[] pse(int a[])
        {
            Stack<Integer> stk=new Stack<>();
            int pse[]=new int[a.length];
            stk.push(0);
            pse[0]=-1;
            for(int i=1;i<a.length;i++)
            {
                while(stk.empty()==false && a[stk.peek()]>=a[i])
                stk.pop();
                if(stk.empty()==false && a[stk.peek()]<a[i])
                pse[i]=stk.peek();
                else
                pse[i]=-1;
                stk.push(i);
            }
            return pse;
        }
        int[] nse(int a[])
        {
            int nse[]=new int[a.length];
            Stack<Integer> stk=new Stack<>();
            stk.push(0);
            for(int i=1;i<a.length;i++)
          { 
              while(stk.empty()==false && a[stk.peek()]>a[i])
            nse[stk.pop()]=i;
              stk.push(i);
          }
          while(stk.empty()==false)
          {
              nse[stk.pop()]=a.length;
          }
          return nse;
        }
        
    
}
