//WAP to find out the factors of a number.
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number ");
  int num = sc.nextInt();
  int i = 1;
  while(i<=num){
   if (num%i==0)
    System.out.println(i);
    i++;
  }
}

 }