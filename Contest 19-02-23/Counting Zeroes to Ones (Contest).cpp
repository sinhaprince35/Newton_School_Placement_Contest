/*
Counting Zeroes to Ones (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a square matrix of size N*N. Initially all elements of this matrix are equal to 0. You are given Q queries. Each query consists of two integers, i and j (1 <= i, j <= N) wherein you increase the value of all elements in the ith row and jth column by 1. After doing this, for each query print the number of zeroes left in the matrix.
Input
The first line of the input consists of two integers N and Q.
The next Q lines each contains two integers i and j.

Constraints:
1 <= N, Q <= 105
1 <= i, j <= N
Output
For each query print the number of zeroes left in the matrix.
*/

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {
	// Your code here
    int n,q;
    cin>>n>>q;
    set<int> row,col;
    while(q--){
        int i,j;
        cin>>i>>j;
        row.insert(i);
        col.insert(j);
        long ans=(n-row.size())*(n-col.size());
        cout<<ans<<" ";
    }
    return 0;
}