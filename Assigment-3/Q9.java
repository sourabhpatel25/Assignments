// Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.Scanner;
class Test{
    public static void main(String Args[]){
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter character");
        char character=cs.next().charAt(0);
      
      if(character>='a' && character <='z'){
        System.out.println("The character is lowercase");
       }
      else if(character>='A' && character<='Z'){
        System.out.println("The character is uppercase");
      }
      else{
        System.out.println("The character is mot an alphabad");
      }
    }}
