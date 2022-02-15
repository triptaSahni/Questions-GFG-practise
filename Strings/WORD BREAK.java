// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}// } Driver Code Ends


//User function Template for Java
/*
class Sol
{
     //code here
        
        /*
     static boolean present(String s)
        {
            for(String i:hs)
            {
                if(i.contains(s))
                return true;
            }
                return false;
        }
        
    public static int wordBreak(String A, ArrayList<String> B )
    {
     HashSet<String> hs=new HashSet<String>();
        for(int i=0;i<B.size();i++)
        {
            hs.add(B.get(i));
        }
       
     
        String s=""+A.charAt(0);
        for(int i=0;i<A.length();i++)
        {
       
          if(hs.contains(s))
          {
              A=A.substring(i+1);
              if(hs.contains(A))
              return 1;
              i=-1;
              if(A.length()==0)
              return 1;
              s=""+A.charAt(0);
          
           }
         else
          {
              if(i+1==A.length())
          { 
          return 0;
          }
          s=s+A.charAt(i+1);
         
        System.out.println(s);
          }
        }
     
        return 0;
    }
}
*/
class Sol
{
    
    
    public static int wordBreak(String A, ArrayList<String> B )
    {
        HashSet<String> stk=new HashSet<String>(); 
        for(int i=0;i<B.size();i++)
        {
            stk.add(B.get(i));
        }
        
    boolean t=isPossible(A,stk);
    if(t)
    return 1;
    else return 0;
        
    }
    
    
    
    static boolean isPossible(String A,HashSet<String> stk)
    {
        if(A.length()==0)
        return true;
      for(int i=1;i<=A.length();i++) 
      {
          if(stk.contains(A.substring(0,i)))
       {  
           if(isPossible(A.substring(i,A.length()),stk)==true)
         return true;
        
           
       }
      }
      return false;
    }
}
