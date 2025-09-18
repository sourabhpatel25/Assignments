// ArrayIndexOutOfBoundsException

// 👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caught
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        
        try{
        System.out.println("Enter index");
         int s1=sc.nextInt();
         System.out.println("Element at index" + s1 + "=" + arr[s1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + "caught");
        }

    }
}
