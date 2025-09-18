 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int length,breadth,perimeter;
              System.out.println("enter the length");
        length=sc.nextInt();
           System.out.println("enter the length");
        breadth=sc.nextInt();
        perimeter=2*(length+breadth);
        int totalDistance=10*perimeter;
        System.out.println("ron covers total:"+totalDistance+" m");
    }
}