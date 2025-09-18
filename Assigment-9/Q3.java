/*2. Write a Java program to create a class called "Dog" with a name and breed attribute.
 Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
*/
class Dog{
    private String name;
    private String bread;
    

    public Dog(String name,String bread){
     this.name=name;
     this.bread=bread;
     
}

public void display(){
    System.out.println("Name: "+this.name+ "Bread: "+this.bread);
}
}
class TestMain{
    public static void main(String args[]){
        Dog D1=new Dog("puppy","american");
        Dog D2=new Dog("tomy","indian");
        D1.display();
        D2.display();     

      }
}