class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=n; line>=1; line--){
    for(int space = 0; space<n-line ; space++){
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