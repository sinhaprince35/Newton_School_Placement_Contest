/*
Max Score in Quiz (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob participated in N Quizzes. Each quiz consists of M questions. Given an N X M matrix results where results[i][j] = 1 if Bob answered jth question correctly in the ith Quiz.

Each correct answer gives 10 marks and he has the option to select any quiz session for the marks evaluation.

What is the maximum marks Bob can get in a quiz?
Input
First line contains N and M.
Next N lines contain M integers each.

Constraints
1 ≤ N, M ≤ 1000
results[i][j] = 0 or 1
Output
A single integer denotes maximum marks.
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
        int M=sc.nextInt();
        int max=0;
        int[][] arr=new int[N][M];
        for(int i=0; i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            int total=0;
            for(int j=0;j<M;j++){
                total=total+arr[i][j];
            }
            if(total>max){
                max=total;
            }
        }
        System.out.print(max*10);
    }
}