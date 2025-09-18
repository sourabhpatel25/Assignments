//19. Write a Java program to replace a specified character with another character
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();

        
        System.out.print("Enter the character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = sc.next().charAt(0);


        String s2 = s1.replace(oldChar, newChar);

        
        System.out.println("Original String: " + s1);
        System.out.println("Modified String: " + s2);

        
    }
}
