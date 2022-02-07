// question : Program to check if a given year is leap year

// process to solve:
//     1.get condition for leap year and put them in if & else condition

// Solution:    

package Lecture2.Problems;


public class leap_year
{
    Public static void main(String[] args)
    {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.newInt();
        if(year%4 == 0 && year%100 == 0 && year%400 == 0)
        {
            System.out.println(year +"is a leap year");
        }
        else
        {
            System.out.println(year +"is not a leap year");
        }
    } 
}

