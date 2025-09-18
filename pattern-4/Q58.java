class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=n; line>=1; line--){
    for(int space = 0; space<n-line ; space++){
        System.out.print(" ");
    }
    char ch='A';
    for (int j=1; j<=line; j++){
                if(line==j || line==5 || j==1)    
                System.out.print(ch);
                else System.out.print("_");
                ch++;
 }
       System.out.println();
    }

} 
}