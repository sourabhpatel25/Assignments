//Abstract class.
 abstract class Parent{
    void run(){
        System.out.println("Running");
    }
     abstract void walk();
 }
 class Child extends Parent{
    void walk(){
        System.out.println("Walking");
    }
 }
 class Main{
  public static void main(String args[]){

    Child obj=new Child();
    obj.run();//running.
    obj.walk();//walking.   
  }
 }