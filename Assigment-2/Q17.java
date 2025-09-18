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
        System.out.println("luci need "+perimeter+"m ribbon to cover the border of the board");
    }
}