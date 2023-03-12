/*
Help Samar with Chopsticks (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Actually, a pair of chopsticks need not have two sticks that are the same length. You can eat with a pair of sticks as long as the length difference is no greater than D. Samar is appointed as a head chef of a restaurant. He is provided with N sticks, the ithstick of which is L[i] units long. More than one set of chopsticks cannot share the same stick. Assist him in matching the sticks to create as many functional pairs of chopsticks as possible.
Input
The first line contains two space-separated integers N and D. The next N lines contain one integer each, the ithline giving the value of L[i].

Constraints
1 ≤ N ≤ 10,000 (105)
0 ≤ D ≤ 1,000,000,000 (109)
1 ≤ L[i] ≤ 1,000,000,000 (109) for all integers i from 1 to N
Output
Output a single line containing the maximum number of pairs of chopsticks Samar can form.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] chopstick=new int[n];
        for(int i=0;i<n;i++){
            chopstick[i]=sc.nextInt();
        }
        Arrays.sort(chopstick);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n && chopstick[j]-chopstick[i] <=d;j++){
                count++;
                i=j;
                break;
            }
        }
        System.out.println(count);
    }
}