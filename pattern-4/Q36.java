/*
12345
1234
123
12
1
*/
class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=1; line<=5; line++){
    for(int star=1; star<=5-line+1; star++){
        System.out.print(star);
    }
    System.out.println();
} 
}
}