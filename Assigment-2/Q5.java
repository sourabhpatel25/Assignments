//5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int length,breadth,perimeter,area,cost;
        System.out.println("enter the value of length");
        length=sc.nextInt();
        System.out.println("enter the cost");
        cost=sc.nextInt();
        perimeter=cost/25;
        breadth=(perimeter/2)-length;
        area=length*breadth;
        System.out.println(breadth);
        System.out.println(perimeter);
        System.out.println(area);
    }
}