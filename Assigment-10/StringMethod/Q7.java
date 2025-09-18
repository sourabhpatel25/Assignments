//write  trim method of string.
import java.util.Scanner;

class Sequence{
     private String data;
     public Sequence(String data){
        this.data=data;
     }
     public String getTrim(){
        char arr[]=data.toCharArray();
        for (int i=0,j=arr.length-1;true;){
            if(arr[i]!=' ' && arr[j]!=' ')
            break;
             
             if (arr[i]==' ')
               arr[i++]='\0';

            if (arr[j]==' ')
               arr[j--]='\0';
        }
        return new String(arr);
     }
}
class Test{
    public static void main(String args[]){
        Sequence s1=new Sequence("   Hello  World   ");
        String s=s1.getTrim();
        System.out.println(s);
            }
}