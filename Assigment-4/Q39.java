// WAP to check whether entered number is strong or not
import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int num =sc.nextInt();
    int orginal=num;
    int sum =0;
    while (num>0){
        int digit=num %10;
        int fact=i;
        int i=1; 
        while(i<=digit){
            fact=fact*i;
            i++;
        }
        sum=sum +fact;
        num= num /10;
        
       }
       if (sum==orginal){
        System.out.println("it is strong");
       }
        else{
            System.out.println("it is not strong");
        }
       }
}