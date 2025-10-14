///Static and instance
 class Students{
    
     String name;
     int age;
     int id;

    Students(String name,int age,int id){
     this.name=name;
     this.age=age;
     this.id=id;

}
    static String foundation="ITEP Foundation";
    
   void display(){
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("ID:"+id);

   }

 }
 class Main{
    public static void main(String args[]){
    Students s1=new Students("Student",21,101);
    System.out.println(Students.foundation);
    s1.display();

   }
 }