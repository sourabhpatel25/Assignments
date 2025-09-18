//35. Write a java program to implement selection sort algoritm
import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int size=sc.nextInt();
    
    int arr[]=new int[size];
    System.out.println("Enter array elemenets");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    for (int i = 0; i < size - 1; i++) {
            int minIndex = i;  

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    System.out.print("Sort array(Selection sort) \n");
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }

  }
}