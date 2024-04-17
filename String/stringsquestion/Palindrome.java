
package com.mycompany.stringsquestion;
import java.util.*;
import java.io.*;

public class Palindrome 
{
    
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) 
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
class Solution
{
    int isPalindrome(String S)
    {
        int n=S.length();
        for(int i=0,j=n-1;i<n/2;i++,j--)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                return 0;
            }
        }
        return 1;
    }
};