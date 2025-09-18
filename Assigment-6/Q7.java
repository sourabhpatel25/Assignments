// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

// Example 1:
// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.

// Example 2:
// Input:
// N = 10, S = 15
// A[] = {1,2,3,4,5,6,7,8,9,10}
// Output: 1 5
// Explanation: The sum of elements 
// from 1st position to 5th position
// is 15.
// 1 <= N <= 105
// 1 <= Ai <= 109
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        int k=9;
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=1;j<arr.length;j++){
                sum=sum+arr[i];
                if(k==sum){
                    System.out.println((i)+" "+(j));
                }    
                if(sum>k)break;
            }
        }
    }
}