import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int height,base,area;

        System.out.println("enter the value of base");
        base=sc.nextInt();
        System.out.println("enter the value of area");
        area=sc.nextInt();
        height=(2*area)/base;
        System.out.println(height);
    }
}