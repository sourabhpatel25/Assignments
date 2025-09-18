/*
EEEEE
DDDD
CCC
BB
A
*/

class Test{
    public static void main(String args[]){
char ch='A';
        for (int line=5; line>=1; line--){
            ch=(char)('A'+line-1);
            for (int j=1; j<=line; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}