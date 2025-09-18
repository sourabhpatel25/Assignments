/*
1
12
123
1234
12345
*/
class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=1; line<=5; line++){
    for(int space = 0; space<5-line ; space++){
        System.out.print(" ");
    }
    for(int star=1; star<=line; star++){
        System.out.print(star);
    }
    System.out.println();
} 
}
}