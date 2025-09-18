import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int a;
        System.out.println("enter the length of side");
        a=sc.nextInt();
        double area=0.433*a*a;
        System.out.println(area);
    }
}