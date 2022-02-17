class Solution
{
       public int climbStairs(int n) {
        int cache[]=new int [n+1];
        Arrays.fill(cache,-1);
           int curr=0;
    return climb(curr,n,cache);
    }
    public int climb(int curr,int n,int cache[])
    {
        if(curr==n)
            return 1;
        if(curr>n)
            return 0;
        if(cache[curr]!=-1)
            return cache[curr];
        return cache[curr]=(climb(curr+1,n,cache)+climb(curr+2,n,cache));
    }
}
