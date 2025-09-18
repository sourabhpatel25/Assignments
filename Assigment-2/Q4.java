//4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.
import java.util.Scanner;
class Test{

    public static void main(String args[]){
    Scanner cs= new Scanner( System.in); 

    int length = 300,breadth = 150,rate = 6,ares; // $ per 100 square meter
    System.out.println("enter the length of tiling");
    length=cs.nextlnt();
    System.out.println("enter the breadth of tiling");
    breadth=cs.nextlnt();
    area=length*breadth;
    System.out.println("the area of tiling is :"+area);

    cost = (area / 100) * rate;
    System.out.println("the rate of tiling :"+cost);

    }
}