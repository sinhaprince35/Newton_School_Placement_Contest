/*
Mohit and array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
The first line of input contains a single integer N, the next line contains N-1 space-separated integers.

Constraints:-
1 ≤ N ≤ 1000
1 ≤ elements ≤ N
Output
Print the missing element */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++)
        {
            sum1=sum1+i;
        }
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum2=sum2+arr[i];
        }
        int sum=sum1-sum2;
        System.out.println(sum);
    }
}