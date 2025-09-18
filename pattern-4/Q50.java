/*
A
AB
ABC
ABCD
ABCDE
*/

class Test{
    public static void main(String args[]){
   
   for (int line=1; line<=5; line++){
    for(int space = 0; space<5-line ; space++){
        System.out.print(" ");
    }
    char ch='A';
    for(int star=1; star<=line; star++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
} 
}
}