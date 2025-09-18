// 13) Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
// init - to input radius from user
// calc - to calculate area
// display- to display area\
import java.util.Scanner;
class Circle{
    private int  radius;
    private double area;
    
    public void init(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius=");
        //  this.radius=radius;
         radius =sc.nextInt();
    }
    public void calc(){
         area=Math.PI*radius*radius;

    }
    public void display(){
        System.out.println("area of circle is ="+area);
    }

}
class Test{
    public static void main(String args[]){
        Circle c=new Circle();
        c.init();
        c.calc();
        c.display();
}
}