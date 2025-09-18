
/*
5
54
543
5432
54321
*/

class Test{
    public static void main(String args[]){

        for (int line=1; line<=5; line++){
            for (int star=5; star>=6-line; star--){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}