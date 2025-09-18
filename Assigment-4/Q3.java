// WAP to find out the sum of N natural number.
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the natural number");
  int num = sc.nextInt();
  int i = 1;
  int sum = 0;
  while(i<=num){
    sum +=i;
     i++;
    System.out.println("sum"+sum);
    
  }
}

 }