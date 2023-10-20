//QUESTION: find the power of numbers



//---------------------------------
//SOLUTION:
//---------------------------------
package Lecture3.Problems;


import java.util.Scanner;
import java.lang.Math;

public class power_of_a_number 
{
    public static void main(String[] args)
    {
        int N,P,F;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number: ");
        N = sc.nextInt();
        System.out.println("input the power: ");
        P = sc.nextInt();
        //Math.pow(int number,int power) it was used to find power of a number
        F = (int) Math.pow(N,P);
        System.out.println(F);
    } 
}
