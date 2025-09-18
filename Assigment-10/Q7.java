//WAP to remove the duplicate letters from given String.
// Sample Input: aabbccddd
// Output: abcd

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String =");
        String str=sc.next();
        
         //method-1
        // String newStr="";
        // for(int i=0; i<str.length(); i++){
        // String s=""+str.charAt(i);
         // if(newStr.contains(s)==false) newstr +=str.charAt(i);
        // }
        // System.out.println("New String is ="+newStr);

        // method-2

        int occurence[] = new int[26];
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i) - 97;
            if(occurence[idx] == 0){
                newStr += str.charAt(i);
                occurence[idx]++;
            }
            else occurence[idx]++;
        }
    
        System.out.println("new string is = "+ newStr);
    }
}
    
