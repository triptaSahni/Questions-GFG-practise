class Solution
{
    int  numDistinct(String S, String T)
    {
	// Your code here	
      int cache[][]=new int[S.length()+1][T.length()+1];
     for(int i=0;i<S.length()+1;i++)
     {
        Arrays.fill(cache[i],-1);
     }
	int w=ways(S,T,0,0,cache);
	return w;
    }
int ways(String s,String t,int m,int n,int cache[][])
{
    int inc=0;
    if(n==t.length())
    return 1;
    if(m==s.length())
    return 0;
    if(cache[m][n]!=-1)
     return cache[m][n];
    
if(s.charAt(m)==t.charAt(n))
 inc=ways(s,t,m+1,n+1,cache);
 int exc=ways(s,t,m+1,n,cache);
 return cache[m][n]=inc+exc;
}
}
