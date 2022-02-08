package Lecture3.Problems;

import java.util.Scanner;

public class average_calculator 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        //for taking inputs for array
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
       // for adding all the numbers in an array
        int sum = 0;
        for(int i=0;i<N;i++)
        {
           int t = arr[i];
           sum = sum + t;
        }
        // now calculate the average
        int avg = sum / N;
        System.out.println(avg);
    }
}
