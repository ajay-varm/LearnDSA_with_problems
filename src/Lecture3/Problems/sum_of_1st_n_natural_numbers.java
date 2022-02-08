package Lecture3.Problems;

import java.util.Scanner;

public class sum_of_1st_n_natural_numbers 
{
    public static void main(String[]args)
    {
        int N,sum;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sum = 0;
        for(int i=1;i<=N;i++)
        {
            sum = sum + i;
        }
        System.out.print("Sum of first ");
        System.out.print(N);
        System.out.print(" Natural numbers is : "+ sum);
    }    
}
