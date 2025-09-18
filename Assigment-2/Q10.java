import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        System.out.println("enter the length of side");
        a=sc.nextInt();
        float area=0.5f*a*a;
        System.out.println(area);
    }
}