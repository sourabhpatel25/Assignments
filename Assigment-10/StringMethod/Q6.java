//length of array
import java.util.Scanner;
class Sequence{
   public String data;
  public Sequence (String data){
    this.data=data;
  }
  
  public int getLength(){
    int count=0;
    char arr[]=data.toCharArray();
    for(char element:arr)
    count++;
  return count;  
  }
}
class Test{
    public static void main(String args[]){
        Sequence s1=new Sequence("Hello");
        int s2=s1.getLength();
        System.out.println(s2);
    }
}