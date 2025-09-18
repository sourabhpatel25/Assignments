//WAP to find out the factorial of a number.
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number ");
  int num = sc.nextInt();
  int i = 1;
  long factorial=1;
  while(i<=num){
    factorial=factorial*i;
    i++;
    System.out.println("factorial"+num+ ":"+factorial);
    i++;
  }
}

 }