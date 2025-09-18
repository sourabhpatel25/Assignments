import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int length,breadth,surfaceArea;
           System.out.println("enter the length ");
        length=sc.nextInt();
           System.out.println("enter the breadth");
        breadth=sc.nextInt();
        surfaceArea=length*breadth;
        System.out.println("tina have to buy "+surfaceArea+"m^2 carpet to cover then room");
    }
}