/*
4. Write a Java program to create a class called "Circle" with a radius attribute.
 You can access and modify this attribute. Calculate the area and circumference of the circle.
*/
class Circle{
    private int  radius;


    public Circle(int radius){
     this.radius=radius;
     
}
public void Area(){
 double area=3.14*radius;
 System.out.println("Area of Circle"+area);
}
public void Circumference(){
 double circumference=2*3.14*(radius);
 System.out.println("Circumference of Circle"+circumference);
}
        
}
class TestMain{
    public static void main(String args[]){
        Circle area=new Circle(10);
        Circle circumference=new Circle(20);
        area.Area();
        area.Circumference();
        circumference.Area();
        circumference.Circumference();


      }
      }
