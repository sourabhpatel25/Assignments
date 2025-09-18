/*
Circle Geometry
Create a class Circle with field radius.
Use a setter to assign radius. Add methods to compute area and circumference.
*/
class Circle{
    private int radius;
    public void setvalue(int radius){
        this.radius=radius;
}
public int setradius(){
    return radius;
}
public double isAres(){
    return (3.14*radius*radius);
}
public double iscircumference(){
    return (2*3.14*10);
}
public void displayDetails(){
    System.out.println("Radius: " + radius);
     System.out.println("Area       : " + isAres());
    System.out.println("Circumference    : " +iscircumference());

}
}

class TestMain{
    public static void main(String args[]){
     Circle obj =new Circle();
     obj.setvalue(10);
     obj.displayDetails();
     //getter method
        //System.out.println("\n");
       // System.out.println(obj.getradios());
        //System.out.println(obj.getisAres());
       // System.out.println(obj.getiscircumference()());
    }
}