//37) WAP to check whether entered number is palindrome or not.

import java.util.Scanner;
class Test{
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int num=sc.nextInt();
       int orginal=num;
       int reverse=0;

       while(num>0){
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
       }
       if(orginal==reverse){
        System.out.println("it is palindrom");
       }
       else{
        System.out.println("it is not palindrom");
       }
    }
}