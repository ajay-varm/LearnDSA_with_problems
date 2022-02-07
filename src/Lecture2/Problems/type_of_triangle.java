// QUESTION: Given three integers A, B, and C which denote the sides of a triangle, the task is to check that the triangle is a right-angled, acute-angled, or obtuse-angled triangle.
//-----------------------------
// SOLUTION:
//-----------------------------
package Lecture2.Problems;

import java.util.Scanner;

public class type_of_triangle 
{
    public static void main(String[] args)
    {
        float side1, side2, side3, big_side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        side1 = sc.nextFloat();
        side2 = sc.nextFloat();
        side3 = sc.nextFloat();
        
        if(side1>side2 && side1>side3)
        {
            big_side = side1;
            if(big_side*big_side == (side2*side2)+(side3*side3))
            {
                System.out.println("It was a right-angled triangle");
            }
            else if(big_side*big_side < (side2*side2)+(side3*side3))
            {
                System.out.println("It was a acute-angled triangle");
            }
            else if(big_side*big_side > (side2*side2)+(side3*side3))
            {
                System.out.println("It was a obtuse-angled triangle");
            }
        }
        else if(side2>side1 && side2>side3)
        {
            big_side = side2;
            if(big_side*big_side == (side1*side1)+(side3*side3))
            {
                System.out.println("It was a right-angled triangle");
            }
            else if(big_side*big_side < (side1*side1)+(side3*side3))
            {
                System.out.println("It was a acute-angled triangle");
            }
            else if(big_side*big_side > (side1*side1)+(side3*side3))
            {
                System.out.println("It was a obtuse-angled triangle");
            }
        }
        else
        {
            big_side = side3;
            if(big_side*big_side == (side2*side2)+(side1*side1))
            {
                System.out.println("It was a right-angled triangle");
            }
            else if(big_side*big_side < (side2*side2)+(side1*side1))
            {
                System.out.println("It was a acute-angled triangle");
            }
            else if(big_side*big_side > (side2*side2)+(side1*side1))
            {
                System.out.println("It was a obtuse-angled triangle");
            }
        }
        
    }
}
