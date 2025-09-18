//3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 

 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
           int area,breadth,length,perimeter;
        System.out.println("enter the value of area");
        area=sc.nextInt();
        System.out.println("enter the value of breadth");
        breadth=sc.nextInt();
        
        length=area/breadth;
        perimeter=2*(length+breadth);
        System.out.println(length);
        System.out.println(perimeter);
    }
}
    
    
    
    
  