/*7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not
*/
import java.util.Scanner;
class Test{
    public static void main(String Args[]){
        Scanner cs = new Scanner(System.in);
         float classheld,classattendence;
         System.out.println("Number of classes held");
         classheld=cs.nextFloat();
         System.out.println("Number of classes attended");
         classattendence=cs.nextFloat();

        float percentage=(classheld/classattendence)*100;
        System.out.println("your attendence is :"+percentage);
        if(percentage>=75){
            System.out.println("you are eligible for exam");
        }
        else{
            System.out.println("you are not elligable for exam");}}
}