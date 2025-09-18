// WAP to delete element from array at specific position.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the data size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element's");
        for(int i=0; i<size; i++)
        arr[i] = sc.nextInt();

        System.out.println("Enter the position you can delete");
        int position = sc.nextInt();

        if((position > size)|| (position < 1)) {
            System.out.println("Invalid Position");
        } 
        else {
            for (int i=position-1; i<size-1; i++) {
                arr[i] = arr[i+1];
            } 
            size--;

            System.out.println("After delete");
            for(int i=0; i<size; i++)
            System.out.println(arr[i]);
        }}
}
