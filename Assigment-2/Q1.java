//1. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
import java.util.Scanner;
class Test{
    public static void main(String args[]){

        Scanner cs= new Scanner( System.in);
        int length=70,breadth,perimeter=230,ares;

        System.out.println("enter the value of length");
        length=cs.nextInt();
        System.out.println("Enter the value of perimeter");
        perimeter=cs.nextInt();
        breadth =(perimeter/2)-length;
        System.out.println("Breadth of the rectangle is :"+breadth);
        int area= length*breadth;
        System.out.println("Area of rectangle is:"+area);}
}