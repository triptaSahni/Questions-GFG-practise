class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int cache[]=new int[cost.length+1];
        Arrays.fill(cache,-1);
     int min1=sol(0,cost,cache);
         int min2=sol(1,cost,cache);
        return Math.min(min1,min2);
         
    }
    public int sol(int ci,int cost[],int cache[])
    {
        if(ci>=cost.length)
            return 0;
        if(cache[ci]!=-1)
            return cache[ci];
           int c1=sol(ci+1,cost,cache);
        int c2=sol(ci+2,cost,cache);
        return cache[ci]=Math.min(c1,c2)+cost[ci];
    }
    
    
}
