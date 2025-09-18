//42) WAP to find out HCF of a number
import java.util.Scanner;
class Test{
 public static void main (String args[]){
 Scanner  sc = new Scanner(System.in);
 System.out.println("Enter number A");
 int num1=sc.nextInt();
 System.out.println("Enter number B");
 int num2=sc.nextInt();
  
  int a=num1;
  int b=num2;
  while(num1!=num2){
    if (num1>num2){
        num1=num1-num2;
    }
    else{
        num2=num2-num1;
    }
  }
  System.out.println("HCF of "+a+"and"+b+"is"+num1);

 }

}