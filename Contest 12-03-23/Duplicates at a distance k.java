/*
Duplicates at a distance k
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers that may contain duplicate elements and an integer K, find if there exists a pair of integers (i, j) such that i < j and arr[i]=arr[j] and i and j are exactly k distance apart i.e ( j - i ) = k.
Input
The first line of input contains two integers N and K, next line contains N space-separated integers.

Constraints:-
1 < = N < = 105
1 < = K < = N
1 < = Arr[i] < = 109
Output
Print 1 if there exist elements else print 0.
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
        int K=sc.nextInt();
        int arr[]=new int [N];
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ans(arr,K,N));
    }
    private static int ans(int [] arr, int K, int N){
        for(int i=K;i<N;i++){
            if(arr[i]==arr[i-K]){
                return 1;
            }
        }
        return 0;
    }
}