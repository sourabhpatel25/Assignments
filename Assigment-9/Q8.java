/*
6. Write a Java program  to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
*/
class Employee{
    private String name;
    private String jobtitle;
    private double salary;

    public void Employee(String name,String jobtitle,double salary){
     this.name=name;
     this.jobtitle=jobtitle;
     this.salary=salary;     
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setJobtitle(String jobtitle){
    this.jobtitle=jobtitle;
}
public String getJobtitle(){
    return jobtitle;
}
public void setSalary(double salary){
    this.salary=salary;
}
public double getSalary(){
    return salary;
} public void increment(double percent){
   if(percent>0){
    salary += salary * (percent/100);
   }
}

public void display(){
    System.out.println(" Name: "+this.name+ "\n Jobtitle: "+this.jobtitle+"\n Salary: "+this.salary);
}
}
class TestMain{
    public static void main(String args[]){
        Employee E1=new Employee();
        E1.Employee("Sourabh","Developer",500000);
        E1.display();
        E1.increment(10);
        System.out.println("After Increment............");    
        E1.display();
      }
}