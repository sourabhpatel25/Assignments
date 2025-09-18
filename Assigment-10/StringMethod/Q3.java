//In LowerCase
import java.util.Scanner;
class Sequence{
    private String data;
    public Sequence(String data){
        this.data=data;

    }
    public String getLowerCase(){
        String result="";
        char arr[]=data.toCharArray();
        for(char element:arr){
           if( element >='A'&& element<='Z')
           element=(char)(element+32);
           result=result+element;
        }
        return result;
    }
}
class Test{
    public static void main(String args[]){
        Sequence s1=new Sequence("HELLO");
        String s2=s1.getLowerCase();
        System.out.println(s2);
    }
}
