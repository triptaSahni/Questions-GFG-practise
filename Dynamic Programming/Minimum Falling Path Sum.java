class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int cache[][]=new int[matrix.length+1][matrix.length+1];
        for(int i[]:cache)
        {
            Arrays.fill(i,-1);
        }
        
     for(int i=0;i<matrix.length;i++)
     {
        int s=pathSum(matrix,0,i,cache) ;
         if(s<min)
             min=s;
     }
        return min;
    }
        
    int pathSum(int[][] matrix,int r,int c,int cache[][])
    {
         
            
        if(c<0||c>matrix.length-1)
            return Integer.MAX_VALUE;
        if(r==matrix.length-1)
           return matrix[r][c];
      if(cache[r][c]!=-1)
          return cache[r][c];
        int p1=pathSum(matrix,r+1,c-1,cache);
        int p2=pathSum(matrix,r+1,c,cache);
        int p3=pathSum(matrix,r+1,c+1,cache);
        return cache[r][c]=(Math.min(Math.min(p1,p2),p3)+matrix[r][c]); 
        
        
    }
}
