//WAP to print Fibonacci series.
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number ");
  int n = sc.nextInt();
  int a = 0, b = 1;
  int count = 1;
  while(count<=n){
    System.out.println(a);
    int next =a+b;
    a=b;
    b=next;
    count++;
  }
}

 }