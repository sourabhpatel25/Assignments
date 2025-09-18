//Write a Equals method in aaray.
class Method{
    public boolean isEqual(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        else{
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)) return false;
            }
            return true;
        }
    }
}
class Test{
    public static void main(String args[]){
        Method m = new Method();
        String s1 = "Sourabh";
        String s2 = "sourabh";
        boolean result = m.isEqual(s1, s2);
        System.out.println("Are both string equal = "+ result);
}
}