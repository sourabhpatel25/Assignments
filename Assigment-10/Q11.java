// Input name of a person and count how many vowels it contains. Use String class methods.
import java.util.Scanner;
class Test{
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name  = ");
        String str = sc.nextLine();
        int len = str.length();

        int vowelCount = 0;
        for(int i=0; i<len; i++){
            if(isVowel(str.charAt(i))) vowelCount++;
        }
        System.out.println("Number of vowel are = "+ vowelCount);
        
       
    }
}