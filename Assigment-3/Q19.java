//WAP to exchange value to two variable with third variable and without third variable.
import java.util.Scanner;

class Test{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the variable-1");
        int a=sc.nextInt();
        System.out.println("Enter the variable-2");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);}

}