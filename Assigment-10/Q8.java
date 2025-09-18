// WAP to find out total occurrence of each letter in string.
// 	 Sample Input: aabbccdd
// 	 Output:a- 2 times
// 			b- 2 times
// 			c- 2 times
// 			d- 3 times
import java.util.Scanner;
class Test{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.print("Enter String =");
     String str=sc.next();
     int len=str.length();
     boolean visited[]=new boolean[len];
     for(int i=0; i<len;i++){
        if(visited[i])continue;
        int count=1;
        for(int j=i+1;j<len;j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
                visited[j]=true;
            }
        } 
        System.out.println(str.charAt(i) + " = "+ count +"times");
     }
 }
}