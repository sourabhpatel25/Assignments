// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
class Person{
    private String name;
    private int age;
    

    public Person(String name,int age){
     this.name=name;
     this.age=age;
     
}

public void display(){
    System.out.println("Name"+this.name+"Age"+this.age);
}
}
class TestMain{
    public static void main(String args[]){
        Person P1=new Person("Sourabh",21);
        Person P2=new Person("Pawan",22);
        P1.display();
        P2.display();     

      }
      }
