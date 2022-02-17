class Solution {
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int cache[]=new int[n+1];
        Arrays.fill(cache,-1);
        cache[0]=0;
        cache[1]=1;
        cache[2]=1;
        int a=gTrib(n,cache);
        return a;
    }
    int gTrib(int n,int cache[])
    {
        // if(n==0)
        //     return 0;
        // if(n==1)
        //     return 1;
        // if(n==2)
        //     return 1;
        if(cache[n]!=-1)
            return cache[n];
    return cache[n]=gTrib(n-1,cache)+gTrib(n-2,cache)+gTrib(n-3,cache);
    }
}
