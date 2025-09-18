/*
5
44
333
2222
11111
*/

class Test{
    public static void main(String args[]){
        int n=5;
for(int line=0;line<n;line++){
    for(int space=0;space<n-line-1;space++);
    System.out.println(" ");
}for(int j=0;j<=line;j++){
    System.out.println(n-1);
}
System.out.println();
    }
}