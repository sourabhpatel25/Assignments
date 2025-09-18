// 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
 class Test{
  public static void main(String arg[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number");
  int n = sc.nextInt();
  int count = 1;
  int num = 1;
  int diff = 1;
  while (count <=n){
    System.out.println("num");
    diff++;
    num += diff;
    count++;
  }
  }
  }