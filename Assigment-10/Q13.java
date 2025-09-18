// 13)WAP check if two Strings are anagrams of each other?
// Hint Anagram words: LISTEN - SILENT 
				//      TRIANGLE - INTEGRAL
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string 1 = ");
        String s1 = sc.next();
        System.out.print("enter string 2 = ");
        String s2 = sc.next();
        if(s1.length() != s2.length()) System.out.println("String are not anagrams");
        else{
            boolean visited[] = new boolean[s2.length()];

            for(int i=0; i<s1.length(); i++){
                char ch = s1.charAt(i);
                for(int j=0; j<s2.length(); j++){
                    if(s2.charAt(j) == ch && visited[j]==false){
                        visited[j] = true;
                        break;
                    }
                }
            }

            //check visited
            boolean isAnagram = true;
            for(int i=0; i<visited.length; i++){
                if(visited[i]==false){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram) System.out.println("strings are anagram");
            else System.out.println("strings are not anagram");


        }   
    }
}