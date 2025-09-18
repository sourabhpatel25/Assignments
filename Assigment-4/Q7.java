//WAP to check whether entered number is prime or not.
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number ");
  int num = sc.nextInt();
  int i = 1;
  while(i<=num/2){
   if (num%i==0)
    System.out.println(i);
    i++;
  }
}

 }