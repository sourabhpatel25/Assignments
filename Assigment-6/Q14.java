// Q.14. Find the first non-repeating elment in given array of integers
// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.
// Example 1:
// Input : arr[] = {-1, 2, -1, 3, 2}
// Output : 3
// Explanation:
// -1 and 2 are repeating whereas 3 is 
// the only number occuring once.
// Hence, the output is 3.

// Example 2:
// Input : arr[] = {1, 1, 1}
// Output : 0
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter arry size");
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         boolean flag=false;
        for(int j=i+1; j<size; j++){
          if(arr[i] == arr[j]){
            flag=true;
           break;
          }
        }
        if(flag==false) 
       System.out.println(arr[i] + " is non repating number");
        break;
      }
    

    }
