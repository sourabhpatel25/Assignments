// WAP to print table of a number.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();
      int i=1;
      while(i<=10){
        System.out.println(n+" X "+i+" = "+(n*i));
        i++;
      }
    }
}