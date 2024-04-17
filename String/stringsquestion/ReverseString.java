

package com.mycompany.stringsquestion;


public class ReverseString 
{

    public static void main(String[] args) 
    {
       String str = "MonikaKushwah";
       String ans = "";
       for(int i=str.length()-1;i>=0;i--)
       {
           ans+=str.charAt(i);
       }
       
        System.out.println("Reverse String:"+ans);
    }
}
