//Q.13
//Find the first repeating element in array of integers
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
      for(int i=0; i<size; i++){
     boolean flag=false;
        for(int j=i+1; j<size; j++){
          if(arr[i] == arr[j]){
            flag=true;
           System.out.println(arr[i] + " is reapting");
           break;
          }
        }
        if(flag==true) break;
      }
    

    }
}