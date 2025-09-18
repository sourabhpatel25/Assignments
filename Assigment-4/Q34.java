//34) WAP to check whether entered number is perfect or not
import java.util.Scanner;
class Test{

    public static void main (String args[]){
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number");
     int num = sc.nextInt();
     int i = 1;
     int sum = 0;
     while(i<num){
        if (num%i==0){
            sum+=i;
        }
        i++;
     }
     if(sum==num){
        System.out.println(num+"perfect number");
     }
     else{
        System.out.println(num+"not perfect");
     }
    }

}