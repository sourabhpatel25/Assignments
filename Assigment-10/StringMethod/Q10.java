//subString method
class Method{
    public String subString(String str, int start, int end){
        String s = "";
        for(int i=start; i<end; i++){
            s += str.charAt(i);
        }
        return s;
    }
}
class Test{
    public static void main(String args[]){
        Method m = new Method();
        String str = "Sourabh Patel";
        System.out.println(m.subString(str,2,6));
}
}