 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int length,breadth,height;
          System.out.println("enter the length");
        length=sc.nextInt();
           System.out.println("enter the breadth");
        breadth=sc.nextInt();
           System.out.println("enter the hight");
        height=sc.nextInt();
        
        int vol=length*breadth*height;
        System.out.println("the volume of cube is :"+vol);
    }
}