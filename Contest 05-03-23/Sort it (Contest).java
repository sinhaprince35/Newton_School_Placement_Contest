/*
Sort it (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers containing only 0 or 1. You can do the following operations on the array:
swap elements at two indices
choose one index and change its value from 0 to 1 or vice-versa.

You have to do the minimum number of the above operations such that the final array is non-decreasing.
Note Consider 1 based Array-indexing
Input
The first line of input contains a single integer N.
The second line of input contains N space-separated integers denoting the array.

Constraints:
1 ≤ N ≤ 100000
elements of the array are 0 or 1.
Output
Minimum number of moves required such that the final array is non- decreasing.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Arr[]=new int[N];
        for(int i=0; i<N;i++){
            Arr[i]=sc.nextInt();
        }
        int Zero=0;
        for(int i=0;i<N;i++){
            if(Arr[i]==0){
                Zero++;
            }
        }
        int Res=0;
        for(int i=0;i<Zero;i++){
            if(Arr[i]==1){
                Res++;
            }
        }
        System.out.println(Res);
    }
}