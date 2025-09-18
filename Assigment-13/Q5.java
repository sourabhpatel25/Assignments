// Multiple Catch Blocks

// 👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.
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
    catch(InputMismatchExceptio e){
        
        System.out.println(e + "caught");
   }
  }
 }
