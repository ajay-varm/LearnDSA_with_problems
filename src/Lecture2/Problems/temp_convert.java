//Question: convert the following into celsius and fahrenheit

// Solution:
package Lecture2.Problems;

import java.util.Scanner;

public class temp_convert 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double  number_for_celsius,input_celsius,input_fahrenheit,number_for_fahrenheit,output_for_celsius,output_for_fahrenheit, option;
        System.out.println("Input '1' if you give input celsius and '2' if you input fahrenheit");
        option = sc.nextDouble();
        number_for_celsius = 1;
        number_for_fahrenheit = 2;
        if(option ==  number_for_celsius)
        {
            System.out.println("input the celsius value: ");
            input_celsius = sc.nextDouble();
            output_for_celsius =  ((input_celsius*9)/5)+32;
            System.out.println(output_for_celsius);
        }
        else if(option == number_for_fahrenheit)
        {
            System.out.println("input the fahrenheit value: ");
            input_fahrenheit = sc.nextDouble();
            output_for_fahrenheit = ((input_fahrenheit-32)*5)/9;
            System.out.println(output_for_fahrenheit);
        }
        else
        { 
        System.out.println("Please enter the correct value");
        }
    }        
}
