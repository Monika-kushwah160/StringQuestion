
package com.mycompany.stringsquestion;


public class StringNumber 
{
    

    public static void main(String[] args)
    {
        String a = "this is a test string for testing";
        String res="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == 32)
            {
                res = res+" ";
                continue;
            }
            res = res+(int)a.charAt(i);
        }
        System.out.println(res);
    }
}
    

