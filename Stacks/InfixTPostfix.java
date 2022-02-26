import java.util.Scanner;



import java.util.*;
class Fixes
{
    String infix,postfix="";
    Fixes(String infix)
    {
        this.infix=infix;
    }
    public void convert()
    {
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<infix.length();i++)
        {
            if(Character.isDigit(infix.charAt(i)))
                postfix+=infix.charAt(i);
           
            else
            {
                   if(stk.size()==0)
                {
                    stk.push(infix.charAt(i));
                }
               else
                {
                  
                   if((infix.charAt(i)=='^')&&(stk.peek()=='-'||stk.peek()=='+'||stk.peek()=='*'||stk.peek()=='/'))
                   {
                       stk.push(infix.charAt(i));
                   }
                    else if((stk.peek()=='^')&&(infix.charAt(i)=='+'||infix.charAt(i)=='-'||infix.charAt(i)=='/'||infix.charAt(i)=='*')){
                          postfix+=stk.pop();
                        stk.push(infix.charAt(i));
                    }
                    else if((stk.peek()=='*'||stk.peek()=='/')&&(infix.charAt(i)=='+'||infix.charAt(i)=='-')){
                      while(stk.size()!=0)
                      { postfix+=stk.pop();}
                        stk.push(infix.charAt(i));
                  }
                   else if(((stk.peek()=='+'||stk.peek()=='-')&&(infix.charAt(i)=='+'|| infix.charAt(i)=='-'))||((stk.peek()=='*'||stk.peek()=='/')&&(infix.charAt(i)=='*'|| infix.charAt(i)=='/')))
                    {
                   
                         
                            postfix+=stk.pop();

                       stk.push(infix.charAt(i));  
                    }
                   else if((infix.charAt(i)=='+'||infix.charAt(i)=='-'||infix.charAt(i)=='*'||infix.charAt(i)=='/')&&(stk.peek()=='*'||stk.peek()=='/'))
                   {
                       while(stk.size()!=0)
                      { 
                           postfix+=stk.pop();
                       }
                       stk.push(infix.charAt(i));
                   }
                    else if((stk.peek()=='+'||stk.peek()=='-')&&(infix.charAt(i)=='*'||infix.charAt(i)=='/'))
                        stk.push(infix.charAt(i));
                    else if(infix.charAt(i)=='(')
                        stk.push('(');
                    else if(stk.peek()=='(')
                        stk.push(infix.charAt(i));
                    else if(infix.charAt(i)==')')
                    {
                        while(stk.peek()!='(')
                        {
                           
                            postfix+=stk.pop();
                        }
                        stk.pop();
                    }
                     else{
                           stk.push(infix.charAt(i));
                    }
                }
            }
        }
     while(stk.size()!=0)
     {
         postfix+=stk.pop();
        
     }
    }
}





public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n; int[] A;

        n = scan.nextInt();
        while(n-- > 0){
            String equation = scan.next();
            Fixes fix= new Fixes(equation);
            System.out.println("Infix: " + equation);
            fix.convert();
            System.out.println("Postfix: " + fix.postfix);
            System.out.println("---");
        }

    }
}
