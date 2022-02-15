class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lastS="";
        if(strs.length==1)
            return strs[0];
        
        else
        {
            String s="";
           
                for(int i=0;i<strs[0].length()&&i<strs[1].length();i++)
                 {
                  
             if(strs[0].charAt(i)==strs[1].charAt(i))
                 s+=strs[0].charAt(i);
             else
                 break;
                }

            if(s=="")
                return s;
          if(Arrays.asList(strs).contains(""))
              return "";
            for(int i=2;i<strs.length;i++)
            {
                
            for(int j=0;j<s.length();j++)
            {
               
                if(j<strs[i].length()&&strs[i].charAt(j)==s.charAt(j))
                   continue;
                else
                    s=s.substring(0,j);
            
            }
            
                
            }
            return s;
            
            
        }
    }
}
