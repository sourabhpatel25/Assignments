 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int a,b,c,perimeter;
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        System.out.println("enter the value of perimeter");
        perimeter=sc.nextInt();
        c=perimeter-a-b;
        int s=(a+b+c)/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
    }
}