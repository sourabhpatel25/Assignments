class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=n; line>=1; line--){
    for(int space=line; space<=n; space++){
        System.out.print(" ");
    }
    char ch ='A';
    for (int j=1;j<=(line);j++ ){
                System.out.print(" "+ch);
                ch++;
     
 }
       System.out.println();
    }

} 
}
