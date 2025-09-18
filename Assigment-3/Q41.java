/*26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade 
    */
   import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics out of 100:");
        int physics = sc.nextInt();
        System.out.println("Enter marks of  Chemistry out of 100:");
        int chemistry = sc.nextInt();
        System.out.println("Enter marks of biology out of 100:");
        int biology = sc.nextInt();
        System.out.println("Enter marks of Mathematics  out of 100:");
        int mathematics = sc.nextInt();
        System.out.println("Enter marks of  Computer out of 100:");
        int computer = sc.nextInt();
        int obtained = physics + chemistry + biology + mathematics + computer;
        // System.out.printf("%d\n", obtained);
        double percent = (obtained/500.0)*100.0;
        if(percent >= 90){
            System.out.println("Grade A");
        }
        else if(percent >= 80){
            System.out.println("Grade B");
        }
        else if(percent >= 70){
            System.out.println("Grade C");
        }
        else if(percent >= 60){
            System.out.println("Grade D");
        }
        else if(percent >= 40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
    }
}