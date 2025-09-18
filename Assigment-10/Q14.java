// WAP check if a String contains only digits?
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string = ");
        String str = sc.next();
        int i;
        for(i=0; i<str.length(); i++){
            //ascii of 0 : 48 and ascii of 9 : 57
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57) continue;
            else break;
        }
        if(i<str.length()) System.out.println("String contains other characters as well " + i);
        else System.out.println("String only contains digits"+i);
}
}