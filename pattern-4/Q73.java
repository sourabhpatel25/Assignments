class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=n; line>=1; line--){
    for(int space=line; space<=n; space++){
        System.out.print(" ");
    }
    for (int j=1;j<=(2*line-1);j++ ){
                System.out.print("*");
     
 }
       System.out.println();
    }

} 
}