/*3. Write a Java program to create a class called "Rectangle" with width and height attributes.
 Calculate the area and perimeter of the rectangle.
 */

class Rectangle{
    private int  width;
    private int height;

    public Rectangle(int width,int height){
     this.width=width;
     this.height=height;
     
}
public void Area(){
 int area=this.height*this.width;
 System.out.println("Area of rectangle"+area);
}
public void Perimeter(){
 int perimeter=2*(this.height+this.width);
 System.out.println("Perimeter of rectangle"+perimeter);
}
        
}
class TestMain{
    public static void main(String args[]){
        Rectangle area=new Rectangle(10,20);
        Rectangle perimeter=new Rectangle(20,30);
        area.Area();
        area.Perimeter();
        perimeter.Area();
        perimeter.Perimeter();


      }
      }
