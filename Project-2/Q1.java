import java.util.ArrayList;
import java.io.*;
class Employee implements Serializable {
    private String name;
    private double salary;
    private int age;
    private int id;

    public Employee(){
        this.name = null;
        this.salary = 0.0;
        this.age = 0;
    }

    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getAge(){
        return this.age;
    }
    public int getId(){
        return this.id;
    }


    public Employee(String name, double salary, int age, int id){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id = id;
    }
    public String toString(){
        return "ID: " + this.id + "\nName: " + this.name +  "\nAge: " + this.age + "\nSalary: " + this.salary;
    }
}

class Test{
    public static void main(String args[]){
        addEmployee();
        readEmployee();
    }

    public static void addEmployee(){
        
        File file = new File("employee.txt");
        if(file.exists()){
            try{
            FileOutputStream fout = new FileOutputStream(file);

                // fout.write(2);
                // fout.write('c');

             ObjectOutputStream out = new ObjectOutputStream(fout);
             Employee emp1 = createEmployee("Harsh Bairagi", 21000, 21, 1);
             Employee emp2 = createEmployee("Sourabh Patel", 21000, 21, 2);
             Employee emp3 = createEmployee("Aman Mishra", 21000, 21, 3);
            
             out.writeObject(emp1);
             out.writeObject(emp2);
             out.writeObject(emp3);

            
            System.out.println("Object has been serialized and saved in employee.txt");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("File doesn't exists");
            try{
                file.createNewFile();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void readEmployee(){
        try{

                FileInputStream fin = new FileInputStream("employee.txt");
                ObjectInputStream in = new ObjectInputStream(fin);

                
             while (true) {
            try {
                Employee emp = (Employee) in.readObject();
                System.out.println(emp);
            } 
            catch (EOFException e) {
                // End of file reached
                 break;
            }
            }
           
        }
        catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
    public static Employee createEmployee(String name, double salary, int age, int id){
        Employee emp = new Employee(name, salary, age, id);
        return emp;
    }
}