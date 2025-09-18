// Problem 3: Online Learning Platform 

// Abstract class Course:

// title, duration fields

// abstract method startCourse(), endCourse()

// concrete method courseDetails()

// Subclasses:

// VideoCourse

// LiveCourse

// Interface CertificateProvider with generateCertificate() method.

// Only VideoCourse provides certificates.

// In main method, simulate starting, ending, and generating certificates.
// --------------------------------------------------------------------------

abstract class Course {
    private String title;
    private int duration; 
   
    public Course(String title,int duration){
        this.title=title;
        this.duration=duration;
    }
    abstract public void startcourse();
    abstract public void endCourse();
    public void courseDetail(){
        System.out.println("course title  "+title+" and duration "+duration+"hours");
    }

}
interface CertificateProvider{
    void generateCertificate();
}
class VideoCourse extends Course implements CertificateProvider{
    public VideoCourse(String title,int duration){
        super(title,duration);
    }
 public void startcourse(){
    System.out.println("video course start with ");

 }
 public void endCourse(){
    System.out.println("video course end ...");
 
}
public void generateCertificate(){
    System.out.println("Video course  certificate .....");
}
}
class LiveCourse extends Course{
    public LiveCourse(String title,int duration){
        super(title, duration);
    }
    public void startcourse(){
    System.out.println("video course start with ");

 }
 public void endCourse(){
    System.out.println("video course end ...");
 
}

}
class Test{
    public static void main(String args[]){
      VideoCourse vc=new VideoCourse("c",20);
      vc.courseDetail();
        vc.startcourse();
        vc.endCourse();
        vc.generateCertificate();
        LiveCourse c=new LiveCourse("python",30);
        c.courseDetail();
        c.startcourse();
        c.endCourse();

   }
}