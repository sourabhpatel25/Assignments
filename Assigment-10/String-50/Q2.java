//. Write a Java program to get the character at the given index within the String
import java.util.Scanner;
class Method{
    public char charAtIndex(String str,int idx){
        char characters[]=str.toCharArray();
        if(idx<=str.length())return characters[idx];
        else return '0';
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Method m =new Method ();
        System.out.print("Enter a string =");
        String str=sc.next();
        System.out.print("Enter a index =");
        int index=sc.nextInt();
        System.out.println("Characters at index "+index+"is"+m.charAtIndex(str,index));
    }
    }
