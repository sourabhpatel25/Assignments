//2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter.
import java.util.Scanner;
class Test{

    public static void main(String args[]){
    Scanner sc= new Scanner( System.in); 
    int area=96,breadth=8,length,perimeter;
    area=sc.nextlnt();
    System.out.println("Enter the area of rectangle");
    breadth=sc.nextlnt();
    length=area/breadth;
    System.out.println("The length of rectangle is:"+length);
    perimeter=2*(length+breadth);
    System.out.println("The perimeter of rectangle is:"+ perimeter);}

}
