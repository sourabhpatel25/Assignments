//32) A	b	C	d	E	f	G	h	…… n terms.
import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

System.out.print("Enter number n terms");
int n =sc.nextInt();
 int i =0;
 char ch='A';
 while(i<n){
    if (i%2==0){
        System.out.println(Character.toUpperCase(ch)+" ");
    }
    else{
        System.out.println(Character.toLowerCase(ch)+" ");
    
    }
     ch++;
     i++;
 }
}
}