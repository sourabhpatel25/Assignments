//25. Write a Java program to reverse the element of an integer 1-D array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arry size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter arry elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int s=0;
        int e=size-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println("Revers intergers");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}