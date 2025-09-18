// Check given character is vowel or not using switch cas.
import java.util.Scanner;
class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char a=sc.next().charAt(0);
        switch (a) {
    case 'a':
      System.out.println("the letter you enterd is vovel");
        break;
    case 'e':
        System.out.println("the letter you enterd is vovel");
        break;
    case 'i':
      System.out.println("The letter you enterd is vovel");
        break;
        
    case 'o':
      System.out.println("the letter you enterd is vovel");
        break;
    case 'u':
      System.out.println("The letter you enterd is vovel");
        break;
        default:
                System.out.println("It is consonant");
}}

}