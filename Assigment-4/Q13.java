//WAP to print N natural numbers in reverse order
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number");
  int n = sc.nextInt();
  while(n>=1){
    System.out.println(n);
    n--;    
  }
}

 }