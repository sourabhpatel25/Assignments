//37. Write a java progrtam to implement insertion sort algorithm.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0&&arr[j]>key){
                arr[i+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
         System.out.println("Sorted Array(Insertion Sort):");
         for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
         }
    }
}