// 6. WAP to find greater among two number 
import java.util.Scanner;
class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your A number");
        int a=sc.nextInt();
        System.out.println("Enter your B  number");
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("both no are equal");
        }
        else if(a>b)
        {
            System.out.println("a is grater than b");
        }
        else
        System.out.println("b is grater than a ");  }

}