/*
Student Result Checker
Create a class Student with fields: name, mathMarks, scienceMarks.
Use setters to assign values. Add a method getAverage().
*/
class Student{
    private String name ;
    private int mathMarks;
    private int scienceMarks;
    public void setvalue(String name,int mathMarks ,int scienceMarks){
        this.name=name;
        this.mathMarks=mathMarks;
        this.scienceMarks=scienceMarks;

}
public int isAverage(){
    return (mathMarks+scienceMarks)/2;

}
public String setname(){
    return name;
}
public int setmathMarks(){
    return mathMarks;
}
public int setscienceMarks(){
    return scienceMarks;
}
public void value(){
    System.out.println("Name              : "   + name);
     System.out.println(" MathMarks       : " +mathMarks);
    System.out.println("ScienceMarks      : " +scienceMarks);
    System.out.println("Average  is     : " +isAverage());

}
}

class TestMain{
    public static void main(String args[]){
     Student obj =new Student();
     obj.setvalue("Anisha",70,90);
     obj.value();
     //getter method
        //System.out.println("\n");
       // System.out.println(obj.getname());
        //System.out.println(obj.getmathMarks());
       // System.out.println(obj.getscienceMarks());
    }
    
}