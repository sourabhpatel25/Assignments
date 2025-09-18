// Problem 6: Zoo Animal Management 

// Abstract class Animal:

// name, age

// abstract methods eat(), makeSound()

// concrete method showInfo()

// Subclasses:

// Lion

// Elephant

// Parrot

// Interface Flyable with fly() method.

// Only Parrot implements Flyable.

abstract  class Animal {
    private int age;
    private String name;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }  
    abstract public void eat();
    abstract public void makeSound();
    public void showinfo(){
        System.out.println("animal name is "+name+"and age is "+age);

    } 
    
}
interface  Flyable{
    void fly();
}
class Lion extends Animal{
    public Lion(String name,int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("lion is eat animal ");
    }
    public void makeSound(){
        System.out.println("lion roars loudly..");
    }
}
class Elephant extends Animal {
    public Elephant(String name,int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("Elephant is eat plants  ");
    }
    public void makeSound(){
        System.out.println("Elephant trumpet loudly..");
    }
}
class Parrot extends Animal implements Flyable{
    public Parrot(String name,int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("Parrot is eat plants  ");
    }
    public void makeSound(){
        System.out.println("Parrot chatter all day..");
    }
    public void fly(){
        System.out.println("parrot can fly...");
    }
}
class Test{
    public static void main(String args[]){
        Lion l =new Lion("tiger",12);
         l.showinfo();
        l.eat();
        l. makeSound();
        
        Elephant e =new Elephant("laddu",10);
        e.showinfo();
        e.eat();
        e.makeSound();
        Parrot p =new Parrot("piku",2);
        p.showinfo();
        p.eat();
        p.makeSound();
        p.fly();
    }
}