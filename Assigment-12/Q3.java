// Problem 2: Employee Management System 

// Abstract class Employee:

// id, name, salary fields

// abstract method calculateSalary()

// concrete method showDetails()

// Subclasses:

// FullTimeEmployee (salary = fixed monthly)

// PartTimeEmployee (salary = hourly * rate)

// Intern (stipend based)

// Interface BonusEligible with method giveBonus().

// Only FullTimeEmployee and PartTimeEmployee should implement BonusEligible.

// In main class, create employees and calculate salary + bonus.

abstract class Employee{
 private int id;
 private String name;
  int salary;
 public Employee(int id,String name){
    this.id=id;
    this.name=name;
    // this.salary=salary;

 }
//  public int getSalary(){
//     return salary;
//  }
 abstract public void calculateSalary();
 public void showDetail(){
    System.out.println("name of empoyee  "+name+"id is "+id+"salary  is "+salary);
 }
 
    
}
interface BonusEligible{
    void giveBonus(int bonus);
}
class FulltimeEmployee extends Employee implements BonusEligible{
     int monthlysalary;
 
 
   public FulltimeEmployee(int id,String name, int mo){
    super(id, name);
    this.monthlysalary=mo;
  }
  public void calculateSalary(){
    
   this.salary=monthlysalary;
   
  }

  public void giveBonus(int bonus){
    this.salary+=bonus;
  }
}

class PartTimeEmployee extends Employee implements BonusEligible{
  private int hour;
  private int rate;
//   private int salary;
  public PartTimeEmployee(int id,String name,int hour,int rate){
    super(id, name);
    this.hour=hour;
    this.rate=rate;

  }
  public  void calculateSalary(){
    this.salary=hour*rate;
          
  } 
   public void giveBonus(int bonus){
    this.salary+=bonus;
  }
}
class Intern extends Employee{
  private  int stiped;
    public Intern(int id,String name,int stiped){
        super(id,name);
       this.stiped=stiped;
    }
   public void  calculateSalary(){
    this.salary=stiped;
    
   }
}
class Test{
    public static void main(String args[]){
        FulltimeEmployee emp=new FulltimeEmployee(1, "prerna", 200000);
        emp.calculateSalary();

        emp.giveBonus(2000);
        emp.showDetail();
        PartTimeEmployee emp1=new PartTimeEmployee(2," naman", 40, 1000);
        emp1.calculateSalary();
        emp1.giveBonus(2000);
        emp1.showDetail();
        Intern emp2=new Intern(3, "nikunj",30000);
        emp2.calculateSalary();
        emp2.showDetail();
 }
}