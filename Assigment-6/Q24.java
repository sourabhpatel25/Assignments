//24. Write a Java program to swap first and last element of an integer 1-d array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr [i]=sc.nextInt();
        }
        int temp=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=temp;
        
        System.out.println("Element swap first to last :");

        for(int i=0;i<size;i++){
        System.out.println(arr[i]);
        }
    }   
}