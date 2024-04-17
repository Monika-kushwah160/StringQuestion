
import java.util.*;
import java.lang.*;

class Parentheses
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            String st = sc.next();
            
           
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }
}
class Solution
{
    static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='['||x.charAt(i)=='('||x.charAt(i)=='{')
            {
                s.push(x.charAt(i));
            }
            else
            {
                if(s.isEmpty()==true)
                {
                    return false;
                }
                else if(x.charAt(i)==']' && s.peek()!='[' ||x.charAt(i)==')' && s.peek()!='('|| x.charAt(i)=='}'&& s.peek()!='{' )
                    {
                        return false;
                    }
                    else
                    {
                        s.pop();
                    }
                }
        }
      if(s.isEmpty()==true)
       {
        return true;
       }
        else
        {
        return false;
        }
        
    }
}
