// WAP to Enter n element in array and print array
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data size");
        int n = sc.nextInt();

        int arr[] = new int[n]; 
        
        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Data..");
        for(int i=0; i<n; i++)
          System.out.println(arr[i]);
        
    }
}