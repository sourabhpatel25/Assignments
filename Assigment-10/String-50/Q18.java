//20. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement
// 20. Replace substring using regex in Java
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the original string:");
        String input = sc.nextLine();

        
        System.out.println("Enter the regex pattern to replace:");
        String regex = sc.nextLine();

    
        System.out.println("Enter the replacement string:");
        String replacement = sc.nextLine();

        
        String result = input.replaceAll(regex, replacement);

    
        System.out.println("Modified string: " + result);

    }
}
