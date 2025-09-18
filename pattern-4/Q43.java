/*
123456
54321
1234
321
12 
1
*/
class Test{
    public static void main(String args[]) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = rows - i + 1; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println(); 
        }
    }
}
