/*
String rearrange (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S. You can rearrange its letters in any way you want. You have to the find the maximum number of substrings in S which are equal to "abcda" after rearrangement.
Input
First line of input contains a single string S.

Constraints:
1 <= |S| <= 100000
String contains lowercase english letters.
Output
Output a single integer which is the maximum number of substrings in S which are equal to "abcda" after rearrangement.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a')a++;
            else if(str.charAt(i)=='b')b++;
            else if(str.charAt(i)=='c')c++;
            else if(str.charAt(i)=='d')d++;
        }
        int minbcd=Math.min(b,c);
        int ans=0;
        minbcd=Math.min(minbcd,d);
        if(a>minbcd){
            ans=minbcd;
        }else{
            while(minbcd>=a &&minbcd>0){
                minbcd--;
            }
            ans=minbcd;
        }
        System.out.print(ans);
    }
}