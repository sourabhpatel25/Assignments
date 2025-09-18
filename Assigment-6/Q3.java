//Q.3 Write a program to reverse the array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter arrya elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size/2;i++){
          int temp=arr[i];
          arr[i]=arr[size-1-i];
          arr[size-1-i]=temp;
        }  
        for(int i=0;i<size;i++)
        System.out.println("Revers number ="+arr[i]);
        }
}