//5.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
class Test{
    
    public static void main(String Args[])
    {
        Scanner cs=new Scanner(System.in);
       int a,b,c;
       char youngest='a',oldest;
       System.out.println("people-1");
       a=cs.nextInt();
       System.out.println("people-2");
       b=cs.nextInt();
       System.out.println("people-3");
       c=cs.nextInt();
 if(a>b && a>c){
    oldest='a';
 }
 else if (b>c && b>c){
    oldest='b';
 }
 else{
    oldest='c';
 }
 System.out.println(oldest);
 if (oldest=='a'&& b>c){
    youngest='c';
 }
 else if (oldest=='b'&& a>c){
    youngest='c';
 }
 else if(oldest=='c'&& b>a){
  youngest='a';   
 }
  System.out.println(youngest);
}}