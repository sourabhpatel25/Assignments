// WAP to print Odd numbers upto N.

import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number");
  int n = sc.nextInt();
  int i = 1;
  while(i<=n){
    if (i%2 != 0)
    System.out.println(i);
    i++;    
  }
}

 }