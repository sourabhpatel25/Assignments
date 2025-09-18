// Write a Java program to check whether a given string ends with the contents of another string

import java.util.Scanner;

 class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter the main string: ");
        String s1String = sc.nextLine();

      
        System.out.print("Enter the substring to check: ");
        String s2String = sc.nextLine();

        
        if (s1String.endsWith(s1String)) {
            System.out.println("Yes, the main string ends with the given substring.");
        } else {
            System.out.println("No, the main string does not end with the given substring.");
        }

        
    }
}
