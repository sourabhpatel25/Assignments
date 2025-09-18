//WAP to print Even numbers upto N.
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an integer number");
      int n = sc.nextInt();
      if(n%2 == 0)
        System.out.println("EVEN");
      else
        System.out.println("ODD");   
    }
}