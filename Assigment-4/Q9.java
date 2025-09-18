//WAP to print N even numbers
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number");
  int n = sc.nextInt();
  int count = 1;
  int num = 2;
  while(count<=n){
    System.out.println(num);
    num += 2 ;
    count++;    
  }
}

 }