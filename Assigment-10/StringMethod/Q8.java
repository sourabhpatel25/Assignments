// is palendrom or not print true or false.
import java.util.Scanner;

class Sequence{
     private String data;
     public Sequence(String data){
        this.data=data;
     }
     public boolean isPalindrome(){
       int i=0;
       int j = data.length()-1;
       while(i<j){
         if(data.charAt(i) != data.charAt(j))
           return false;
         i++;
         j--;  
       }
       return true;
     }
}
class Test{
    public static void main(String args[]){
        Sequence s1=new Sequence("abba");
         boolean s2=s1.isPalindrome();
         System.out.println(s2);
            }
}