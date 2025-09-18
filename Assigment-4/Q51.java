//51) WAP to reverse all the numbers between two entered numbers
 import java.util.Scanner;
 class Test{

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter 1st number");
      int num1=sc.nextInt();
      System.out.println("Enter 2st number");
      int num2=sc.nextInt();
      System.out.println("Reversed number"+num1+"and"+num2);
      int num=num1;
      while(num<num2){
        int original=num;
        int reverse=0;
      while(original>0){
        int digit =original%10;
        reverse=reverse*10+digit;
        original=original/10;
      }
      System.out.println("Original"+num+"reverse"+reverse);
      num++;
 }
 }
 }