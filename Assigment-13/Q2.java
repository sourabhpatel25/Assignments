// InputMismatchException

// 👉 Ask the user to enter an integer. If the user enters text instead, catch the exception.

// // Expected
// Enter an integer: abc
// java.util.InputMismatchException caught
import java.util.InputMismatchException;
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter an integer:abc");
        int s1=sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e + "caught");
        }
    }
}