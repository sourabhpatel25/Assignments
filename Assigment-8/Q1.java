/*
Java OOP Exercises (using Setters)
Employee Record System
Create a class Employee with private fields: id, name, and salary.
Use setter methods to assign values. Add a method to display employee details.
*/
class Employee{
    private int id ;
    private String  name;
    private double salary;
    public void setvalue(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    

}
public int setid(){
    return id;
}
public String setname(){
    return name;
}
public double setsalary(){
    return salary;
}
public void displayDetails(){
    System.out.println("Employee ID : " + id);
     System.out.println("Name       : " + name);
    System.out.println("Salary      : ₹" + salary);

}
}

class TestMain{
    public static void main(String args[]){
     Employee obj =new Employee();
     obj.setvalue(100,"Anisha",45000000);
     obj.displayDetails();
     //getter method
        //System.out.println("\n");
       // System.out.println(obj.getId());
        //System.out.println(obj.getName());
       // System.out.println(obj.getSalary());
    }
    
}