// WAP to find out LCM of a number.
import java.util.Scanner;
class Test{

 public static void main (String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter number A");
int num1=sc.nextInt();
System.out.println("Enter number B");
int num2=sc.nextInt();
int a = num1;
int b = num2;
int lcm= (num1>num2)? num1:num2;
 
 while(true){
    if (lcm%num1==0 && lcm %num2==0){

    break;
    }
    lcm++;
 }
 System.out.println("lcm of"+a+"and"+b+"is "+lcm);
 }
 }
