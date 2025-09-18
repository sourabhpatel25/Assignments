// WAP to count the word whose first letter is  vowel.
import java.util.Scanner;
class Test{
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
        
    }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String =");
    String str=sc.nextLine();
    int len=str.length();

    int wordCount=0;
  ///checking first word
if(isVowel(str.charAt(0))) wordCount++;
///checking other word
for(int i=1; i<len; i++){
    if(str.charAt(i-1)==' '){
        if(isVowel(str.charAt(i))) wordCount++;
    }
}  
System.out.println("Number of words start with vowel are ="+wordCount);  
 }
}