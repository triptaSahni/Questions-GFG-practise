class Solution {
    public int fib(int n) {
        int cache[]=new int[n+1];
        if(n==0)
      return 0;
    if(n==1)
        return 1;
        Arrays.fill(cache,-1);
        cache[0]=0;cache[1]=1;
        int a=gFib(n,cache);
        return a;
    }
public int gFib(int n,int cache[])
{
  // if(n==0)
  //     return 0;
  //   if(n==1)
  //       return 1;
    if(cache[n]!=-1)
        return cache[n];
    return cache[n]= gFib(n-1,cache)+gFib(n-2,cache);
}
}
