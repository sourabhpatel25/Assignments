//23. Write a Java program to find the sum and average of one dimensional integer array.
import java.util.Scanner; 
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0 ; i<size ; i++){
          arr[i]=sc.nextInt();
           }
          int sum=0;
          for(int i=0;i<size;i++){
            sum+=arr[i];
          }
          double averag=(double)sum/size;

          System.out.println("Sum ="+sum);
          System.out.println("Average ="+averag);

        
    }
}