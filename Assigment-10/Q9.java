// find the legth of string.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string =");
        String str=sc.next();
        int len=str.length();
         
         int maxLen=-1;
         String maxword=null;

         String word="";
         for(int i=0;i<len;i++){
            if(str.charAt(i)!=' ')word+=str.charAt(i);
            else{
                if(word.length()>maxLen){
                    maxword=word;
                    maxLen=word.length();
                }
                word="";
            }
         }
         if(word.length()>maxLen){
            maxword=word;
            maxLen=word.length();
         }
         
        System.out.println("MaxWord = "+maxword+" Maxlen = "+ maxLen);
    }
}