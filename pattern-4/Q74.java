class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=n; line>=1; line--){
    for(int space =line; space<=n ; space++){
        System.out.print(" ");
    }
    for (int k=1;k<=line;k++ ){
                System.out.print("* ");
     
 }
       System.out.println();
    }

} 
}