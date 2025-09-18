// WAP to print N natural number.  
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number ");
  int num = sc.nextInt();
  int i = 1;
  while(i<=num){
    System.out.println(i);
    i++;
  }
}

 }