// WAP to find out all the palindrome numbers between two entered numbers
import java.util.Scanner;
class Test{
    public static void main(String args []){
        Scanner sc=new Scanner(String.in);
        System.out.println("Enter 1st number");
        int star=nextInt();
        System.out.println("Enter 2nd number");
        int end=nextInt();
         System.out.println("Palindrom numbeer between"+star+"and"+end);
         for(int num=star;num<=end;num++);
         
         int orginal=num;
         int reverse=0;

         while(num>0){
         int digit=num%10;
         reverse=reverse*10+digit;
         num=num/10;
    }

}
}