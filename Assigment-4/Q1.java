// WAP to print a statement 1000 number of times.
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter statement ");
  String statement = sc.nextLine();
  int i = 1;
  while(i<=1000){
    System.out.println(statement);
  }
}

 }