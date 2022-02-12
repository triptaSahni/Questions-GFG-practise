// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    String n="";
    public String reverse(String S){
        //code here
       
        if(S.length()==0)
        return "";
        else
        //n=S.charAt(S.length()-1)+reverse(S.substring(0,S.length()-1));
       n=reverse(S.substring(1))+S.charAt(0);
        return n;  
        }

}
