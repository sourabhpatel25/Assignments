//21. Write a Java program to check whether a given string starts with the contents of another string
// Check if a string starts with another string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter the main string:");
        String s1 = sc.nextLine();

        
        System.out.println("Enter the string to check:");
        String s2 = sc.nextLine();

        
        if (s1.startsWith(s2)) {
            System.out.println("Yes, the string starts with \"" + s2 + "\"");
        } else {
            System.out.println("No, the string does not start with \"" + s2 + "\"");
        }
    }
}
