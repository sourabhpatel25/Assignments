/*5) Write a java program to reverse each word of String.
Sample Input: Java Is Plateform Independent
Output: avaJ sI mrofetalP tnednepednI
*/
 import java.util.Scanner;

class Test{
    public static String reverseString(String s){
        String newStr="";
        for(int i =s.length()-1;i>=0;i--){
            newStr+=s.charAt(i);
        }
        return newStr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String =");
        String str= sc.nextLine();

        String reverse="";
        String word="";
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)!=' ')word+=str.charAt(i);
            else{
                reverse = reverse + reverseString(word)+" ";
                word="";
            }
        }
        reverse = reverse + reverseString(word)+" ";
        System.out.println("Reversed String ="+reverse);
    }

}