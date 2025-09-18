//write contains method logic.
import java.util.Scanner;
class Method{
    public boolean isContains(String str, String s){
        int len = s.length();
        for(int i=0; i<=str.length()-len; i++){
            String part = str.substring(i,len+i);
            if(part.equals(s)){
                return true;
            }
        }
        return false;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Method m = new Method();
        System.out.println("enter a string = ");
        String str = sc.nextLine();
        System.out.println("enter a substring = ");
        String s = sc.next();
        System.out.println("is "+ str +" contains "+ s +" = " +(m.isContains(str,s)));
}
}