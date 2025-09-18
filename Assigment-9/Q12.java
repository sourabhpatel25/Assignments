// Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.ArrayList;
class Student{
    private String name;
    private char grade;
    private ArrayList<String> courses;
    public Student(String name, char grade){
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }
    public void addCourses(String course){
            courses.add(course);
            System.out.println(course+" Course added");
    }

    public void removeCourses(String course){
        if(courses.size() > 0) {
            courses.remove(course);
            System.out.println(course+" Coursed removed");
        }
    }
    public void displayDetails(){
        System.out.println("Name = "+ this.name);
        System.out.println("Grade = "+ this.grade);
        System.out.println("Courses Enrolled = "+ this.courses); 
    }

}
class Test{
    public static void main(String args[]){
        Book b1 = new Book(10"Sourabh Patel", 'A');
        b1.displayDetails();
        b1.addCourses("Java");
        b1.addCourses("Python");
        b1.addCourses("Apptitude");
        b1.displayDetails();
        b1.removeCourses("Apptitude");
        b1.displayDetails();
}
}