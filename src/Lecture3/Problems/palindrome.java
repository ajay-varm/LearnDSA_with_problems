// QUESTION: palindrome


//-------------------
// SOLUTION:
// ------------------
package Lecture3.Problems;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        int N,originalN;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        originalN = N;

        int temp = 0;
        while(N>0){
            // you will get to know about this ligic when you see the "more on arrays" video in lectures.
            temp = temp*10+(N%10);
            N = N/10;
        }
        if(temp==originalN){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }
}
