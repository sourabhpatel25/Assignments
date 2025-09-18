/*
Rectangle Area Calculator
Create a class Rectangle with fields: length, width.
Use setters to assign values. Add a method to calculate area.
*/
class Rectangle{
    private int length;
    private int  width;
    public void setvalue(int length,int width){
        this.length=length;
        this.width=width;
        
    

}
public int isArea(){
    return (length*width);
}
public int setlength(){
    return length;
}
public int setwidth(){
    return width;
}

public void displayDetails(){
    System.out.println("Length : " +length);
     System.out.println("Width      : " + width);
    System.out.println("Area of Rectangle     : " +isArea() );

}
}

class TestMain{
    public static void main(String args[]){
      Rectangle obj =new Rectangle();
     obj.setvalue(10,34);
     obj.displayDetails();
     //getter method
        //System.out.println("\n");
       // System.out.println(obj.getlength());
        //System.out.println(obj.getwidth());
       // System.out.println(obj.getisArea());
    }
    
}