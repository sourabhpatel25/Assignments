/*
9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.
*/
class Employee{
    private String name;
    private double salary;
    private int hiredate;

    

    public void Employee(String name,double salary,int hiredate){
     this.name=name;
     this.salary=salary;
     this.hiredate=hiredate;     
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setSalary(double salary){
    this.salary=salary;
}
public double getSalary(){
    return salary;
}
public void sethiredate(int hiredate){
    this.hiredate=hiredate;
}
public int gethiredate(){
    return hiredate;
}
  public int serviceyear(){
  return 2025-hiredate;
}

public void display(){
    System.out.println(" Name: "+this.name+ "\n Salary: "+this.salary+"\n Hire Date: "+this.hiredate);
}
}
class TestMain{
    public static void main(String args[]){
        Employee E1=new Employee();
        E1.Employee("Sourabh",60000,2000);
        E1.display();
        int service=E1.serviceyear();
        
        System.out.println("Total Service year............");
        System.out.println(service);    
    
      }
}