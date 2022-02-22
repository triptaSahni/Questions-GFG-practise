class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int cache[][]=new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        for(int i[]:cache)
            Arrays.fill(i,-1);
        int path=uniP(obstacleGrid,0,0,cache);
        return path;
    }
    public int uniP(int obs[][],int m,int n,int cache[][])
    {
        if(m==obs.length-1&& n==obs[0].length-1 && obs[m][n]==0)
            return 1;
       
        if(m>=obs.length)
            return 0;
        if(n>=obs[0].length)
            return 0;
         if(obs[m][n]==1)
            return 0;
        if(cache[m][n]!=-1)
            return cache[m][n];
        int RIGHT=uniP(obs,m,n+1,cache);
        int bottom=uniP(obs,m+1,n,cache);
        return cache[m][n]=RIGHT+bottom;
    }
}
