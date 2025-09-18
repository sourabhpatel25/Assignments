class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=1; line<=n; line++){
    for(int space=line; space<=n; space++){
        System.out.print(" ");
    }
    for (int j=1;j<=(2*line-1);j++ ){
        if(line==j)
                System.out.print("#");
                else{
                    System.out.print("*");
                }
     
 }
       System.out.println();
    }

} 
}
