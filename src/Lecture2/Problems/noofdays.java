// Question: Program to find the number of days in a given month of a given year

//TODO: Process to solve:
		// 1. first take input of month and year
		// 2. get the condition for months in a year and put them in if & else condition 

//FIXME: Solution:

package Lecture2.Problems;

import java.util.Scanner;

public class noofdays 
{
    public static void main(String[] args)
    {
		//declared integers
        int year, month;
		//initializing scanner class
		Scanner sc = new Scanner(System.in);
		//taking first input from terminal
		month = sc.nextInt();
	    //taking second input from terminal
		year = sc.nextInt();
		//if condition : "||" is know as "can be any of them"
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
		{
			System.out.print("Number of days is 31");
        }
		// "&&" is known as it should accept both conditions
		else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
		{
			System.out.print("Number of days is 29");
		}
		else if(month == 2)
		{
			System.out.print("Number of days is 28");
		}
		else
        {
			System.out.println("Number of days is 30");
        }    
    }
}
