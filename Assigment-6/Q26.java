//26. Write a Java program to find the largest and smallest element of an array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
             if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest element :"+largest);
        System.out.println("Smallest element :"+smallest);
    }
}
