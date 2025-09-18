// 16) Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
import java.util.Scanner;
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(){
        this.name=" ";
        this.age=18;
    }
    public void display(){
        System.out.println("a person name is "+name+"and age is "+age);

    }

}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Person s=new Person("rishi",24);
        s.display();
        Person s2=new Person();
        s2.display();
}
}