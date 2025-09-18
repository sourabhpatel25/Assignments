/*
54321
5432
543
54
5
*/
class Test{
    public static void main(String args[]){
   int n =5;
   for (int line=1; line<=n; line++){
    for(int star=5; star>=line; star--){
        System.out.print(star);
    }

    System.out.println();
} 
}
}