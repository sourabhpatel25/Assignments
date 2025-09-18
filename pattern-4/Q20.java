/*
*
##
***
####
*****
*/
class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char symbol = (i % 2 == 0) ? '#' : '*';
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
}
}
}