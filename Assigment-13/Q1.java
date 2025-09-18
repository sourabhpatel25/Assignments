// 1. Divide by Zero Exception

//  Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// // Expected
// Enter first number: 10
// Enter second number: 0
// // java.lang.ArithmeticException caught: / by zero
 
 import java.util.Scanner;
 class Test{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     try{
    System.out.println("Enter First number");
    int s1=sc.nextInt();
   
    System.out.println("Enter second number");
    int s2=sc.nextInt();

    int c=s1/s2;
    
    }
    catch(ArithmeticException e){
        System.out.println(e + "caught");
      }
     
   }
 }