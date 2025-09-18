import java.util.*;
import java.io.*;
class EmpCollection implements Serializable{
    ArrayList<Employee>e=new ArrayList<Employee>();
    
    File file = new File("employee.txt");

    public void displayEmployees(){
        for(Employee emp : e){
            System.out.println(emp.getDetails());
        }
    }

    public void createNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter experience: ");
        int experience = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter contact: ");
        String contact = sc.nextLine();
        e.add(new Employee(name, salary, experience, address, contact));
        try{
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(e);
        } catch(Exception e){

        }

    }

    public void removeEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID you want to remove:");
        int id = sc.nextInt();
        for (int i = 0; i < e.size(); i++) {
        if (e.get(i).getId() == id) {
            e.remove(i);
            System.out.println("Employee with ID " + id + " removed.");
            return;
        }
    }
    try{
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(e);
        } catch(Exception e){

        }

    }
}

class Employee implements Serializable{
    private static final long serialVersionUID = 1l;
    private String name;
    private static int count = 1;
    private int id;  
    private int salary; 
    private int experience; 
    private String address;
    private String contact;

   public Employee(String name,int salary,int experience,String address,String contact){
       
       this.name=name;
       this.id=count++;
       this.salary=salary;
       this.experience=experience;
       this.address=address;
       this.contact=contact;
   }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
   //gettter
   public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }
     public String getDetails() {
        return "Name: " + name + ", ID: " + id + ", Salary: " + salary +
               ", Experience: " + experience + ", years " + ",Address: " + address +
               ", Contact: " + contact;
    }
}

//main class
class TestMain{
    public static void main(String args[]){
        EmpCollection empcoll = new EmpCollection();
        //  for(int i = 1; i <= 4; i++){
        //      empcoll.createNew();
        //  }
        empcoll.createNew();
        empcoll.createNew();

        empcoll.removeEmployee();

        empcoll.displayEmployees();
       
  }
}