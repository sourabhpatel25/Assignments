/*4.A school has following rules for grading System:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/
import java.util.Scanner;
 class Test{

public static void main(String args []){
Scanner cs = new Scanner(System.in);

System.out.println("Enter your marks");
int marks=cs.nextInt();
 
          
if(marks<25){
   char grade='F';
}
else if(marks>=25 && marks<45){
   char garde='E';
}
else if(marks>=45 && marks<50){
   char garde='D';

}
else if(marks>=50 && marks<60){
   char garde='C';

}
else if(marks>=60 && marks<80){
    char garde='B';

}else if(marks>80){
   char garde='A';
}
System.out.println("grade:"+grade);
}}