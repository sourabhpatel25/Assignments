//in UpperCase
import java.util.Scanner;
class Sequence{
    
    private String data;
    public Sequence(String data){
        this.data=data;

    }
    public String getUpperCase(){
        String result="";
        char arr[]=data.toCharArray();
        for(char element:arr){
           if( element >='a'&& element<='z')
           element=(char)(element-32);
           result=result+element;
        }
        return result;
    }
}
class Test{
    public static void main(String args[]){
        Sequence s1=new Sequence("hello");
        String s2=s1.getUpperCase();
        System.out.println(s2);
    }
}