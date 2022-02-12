class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int cache[][]=new int[text1.length()+1][text2.length()+1];
        for(int rows[]:cache)
            Arrays.fill(rows,-1);
       int c=lcs(text1,text2,0,0,cache);
        return c;
        
    }
    public int lcs(String s,String t,int cs,int ct,int cache[][])
    {
        if(cs==s.length()||ct==t.length())
            return 0;
        if(cache[cs][ct]!=-1)
            return cache[cs][ct];
        if(s.charAt(cs)==t.charAt(ct))
        {
           return lcs(s,t,cs+1,ct+1,cache)+1;
        }
    else
           { 
            int c1=lcs(s,t,cs,ct+1,cache);
            int c2=lcs(s,t,cs+1,ct,cache);
            return cache[cs][ct]=Math.max(c1,c2);
    }
        
    }
}
