/*
Max XOR
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of non- negative integers of size N. The task is to find the maximum possible xor between two numbers present in the array.
Input
First line of input contains integer N (length of array). Next line contains N space separated integers which are numbers of array.

Constraints
2 <= N <= 100000
1 <= Arr[i] <= 10^9
Output
Print the the maximum possible xor between two numbers present in the array.
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
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int Mask=0;
        int Max=0;
        for(int i=31;i>=0;i--){
            Mask |=(1<<i);
            Set<Integer>set=new HashSet<>();
            for(int ar:arr){
                set.add(ar & Mask);
            }
            int temp=Max |(1<<i);
            for(int prefix:set){
                if(set.contains(temp^prefix)){
                    Max=temp;
                    break;
                }
            }
        }
        System.out.print(Max);
    }
}