/*
Easy - Peasy (Contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of length N in which you can swap two elements if their sum is odd i.e for every i (1 to N) and j (1 to N) if (Arr[i] + Arr[j]) is odd then you can swap these elements.
What is the lexicographically smallest array you can obtain?
Input
First line of input contains a single integer N. Next line contains N space separated integers depicting the elements of the array.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print N space separated elements i. e the array which is the lexicographically smallest possible
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void smallest(int []arr, int n) {
        // Your code here
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                odd++;
            }else{
                even++;
            }
        }
        if(odd>0 && even>0){
            Arrays.sort(arr);
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        smallest(arr,n);
    }
}