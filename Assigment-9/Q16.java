// Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.
import java.util.ArrayList;
class School{
    private ArrayList<String> teachers;
    private ArrayList<String> students;
    private ArrayList<String> classes;
    public School(){
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(String student){
        students.add(student);
        System.out.println(student+ " Student added successfully");
    }
    public void removeStudent(String student){
        if(students.size() > 0){
            students.remove(student);
            System.out.println(student + " Student Removed successfully");
        }
    }
    public void addTeacher(String teacher){
        teachers.add(teacher);
        System.out.println(teacher + " Teacher added succesfully");
    }

    public void removeTeacher(String teacher){
        if(teachers.size() > 0){
            teachers.remove(teacher);
            System.out.println(teacher + " Teacher Removed successfully");
        }
    }
    
    public void createClass(String clas){
        classes.add(clas);
        System.out.println(clas  +" Class is created");
    }

    public void displaySchoolInfo(){
        System.out.println("\n--- School Information ---");
        System.out.println("Students: " + this.students);
        System.out.println("Teachers: " + this.teachers);
        System.out.println("Classes: " + this.classes);
    }
}
class Test{
    public static void main(String args[]){
        School s = new School();
        s.displaySchoolInfo();
        s.addStudent("Anisha");
        s.addStudent("Khushi");
        s.addStudent("Ram");

        s.addTeacher("Pawan sir");
        s.addTeacher("Sonia mam");
        s.addTeacher("Captain sir");
        s.addTeacher("Hiten sir");

        s.createClass("Java");
        s.createClass("Apptitude");

        s.displaySchoolInfo();
        s.removeTeacher("Hiten sir");
        s.displaySchoolInfo();
}
}