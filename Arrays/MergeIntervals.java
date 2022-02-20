class Solution {
    public int[][] merge(int[][] intervals) {
  
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged=new LinkedList<int[]>();
        for(int[] rows:intervals)
        {
            if(merged.isEmpty()||merged.getLast()[1]<rows[0])
                merged.add(rows);
            else
                merged.getLast()[1]=Math.max(merged.getLast()[1],rows[1]);
        }
        return merged.toArray(new int[merged.size()][]);
}
}
    
    
    
    
    
