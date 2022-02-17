class Solution {
    public List<Integer> getRow(int rowIndex) {
     List<List<Integer>> lt=new ArrayList();
        List<Integer> al=new ArrayList<Integer>();
        
       for(int i=0;i<=rowIndex;i++)
       {
           al=new ArrayList<Integer>();
           
           for(int j=0;j<=i;j++)
           {
               if(j==0||j==i)
                   al.add(1);
               else
               {
                   al.add(lt.get(i-1).get(j)+lt.get(i-1).get(j-1));
               }
             
                  
           }
           lt.add(al);
       }
        return al;
       
    }
}
