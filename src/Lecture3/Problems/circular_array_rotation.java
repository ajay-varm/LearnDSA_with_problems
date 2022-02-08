//QUESTION:


// Circular Array Rotation

// John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test the abilities of Sherlock , Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

// For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

// Example

// arr = [3,4,5]

// k = 2

// queries = [1,2]

// Here k is the number of rotations on arr, and queries holds the list of indices to report. First we perform the two rotations:

// [3,4,5] -> [5,3,4] -> [4,5,3]

// Now return the values from the zero-based indices 1 and 2 as indicated in the queries array.

// a[1]=5

// a[2] = 3

// Function Description

// Complete the code in the editor.

// The question has the following inputs:

// itn arr[]: the array to rotate

// int k: the rotation count

// int queries[1]: the indices to report Returns

// int[q]: the values in the rotated as requested in

// Input Format

// The first line contains space-separated integers, n, k and q, the number of elements in the integer array, the rotation count and the number of queries. The second line contains space-separated integers, where each integer i describes array element arr[i] (where 0<=i<n). Each of the q subsequent lines contains a single integer, queries[i], an index of an element in arr to return.

// Constraints

// 1<=n<=10^5
// Sample Input 0

// 3 2 3
// 1 2 3
// 0
// 1
// 2
// Sample Output 0

// 2

// 3

// 1

// Explanation 0

// After the first rotation, the array is [3,1,2].

// After the second (and final) rotation, the array is [2,3,1].

// We will call this final state array b=[2,3,1]. For each query, we just have to get the value of b[queries[i]].

// queries[0] = 0, b[0] = 2.
// queries[1] = 1, b[1] = 3.
// queries[2] = 2, b[2] = 1.









//----------------------------------------
//SOLUTION:
//------------------------------------------
package Lecture3.Problems;

import java.util.Scanner;

public class circular_array_rotation 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,k,q;
        n = sc.nextInt();
        k = sc.nextInt();
        q = sc.nextInt();

        int arr[] = new int[n];
        int rotatedArray[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int newIndex = (i+k)%n;
            rotatedArray[newIndex] = arr[i];
        }

        for(int i =0;i<q;i++)
        {
            int index = sc.nextInt();
            System.out.println(rotatedArray[index]);
        }

    }
}
