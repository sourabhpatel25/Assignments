//Q.5 Find the kth largest and kth smallest element in array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

      System.out.println("Enter size of array");
      int size= sc.nextInt();
      int[] arr=new int[size];
      System.out.println("Enter array elements");
      for(int i=0; i<size;i++){
        arr[i]=sc.nextInt();
      }
       System.out.println("Enter the value of k");
        int k =sc.nextInt();

       for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;i++){
               if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               }
            }
          } 
      

      //Arrays.sort(arr);
      System.out.println("kth Smallest element"+arr[k-1]);
      System.out.println("kth Largest element"+arr[size-k]);

  }
  }