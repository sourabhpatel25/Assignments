// WAP to find out the sum of all the digits of a number
import java.util.Scanner;
class Test{
    public static void main(String args[]){

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number");
 int num =sc.nextInt

  int sum = 0;       
        int original = num;
        
        while (num != 0) {
            int digit = num % 10;   
            sum = sum + digit;      
            num = num / 10;        

        System.out.println("Digits ka sum of " + original + " is: " + sum);
    }
}
    
}