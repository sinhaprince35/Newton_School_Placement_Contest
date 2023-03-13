/*
Lexographical Rotation (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of length N. Print the lexographically minimum rotation of the array Arr.
All the elements of the array are distinct.
Input
First line of input contains a single integer N.
Second line of input contains N integers denoting the array Arr.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
Output
Print the lexographically minimum rotation of the array Arr.
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
        int []Arr=new int[N];
        for(int i=0;i<N;i++){
            Arr[i]=sc.nextInt();
        }
        int minIndex=0;
            for(int i=1;i<N;i++){
                if(Arr[i]<Arr[minIndex]){
                    minIndex=i;
                }
            }
            for(int i=minIndex;i<N;i++){
                System.out.print(Arr[i]+" ");
            }
            for(int i=0;i<minIndex;i++){
                System.out.print(Arr[i]+" ");
            }
        }
    }