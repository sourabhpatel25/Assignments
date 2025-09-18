// WAP to check wheather number is even or odd.
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("The no you enterd is even");
        }
        else
        System.out.println("The no you enterd is odd ");
    
    }
}