//Q.5 Find occurance of an integer number in array.
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

      boolean b[] = new boolean[size];
      for(int i=0; i<size; i++){
        if(b[i]==true) continue;
        int count = 1;
        for(int j=i+1; j<size; j++){
          if(arr[i] == arr[j]) {
            count++;
            b[j] = true;
          }
        }
        System.out.println(arr[i] + " is occuring "+ count +" times.");
      }
    

    }
}