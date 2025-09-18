/*
11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
*/
import java.util.ArrayList;
class collection{ 
    ArrayList<Library>b=new ArrayList<Library>();
    public void addBook(Library book){
        b.add(book);
    }
    public void removeBook(Library book){
        b.remove(book);
    }
    public void displaybookdetail(){
        for(Library book:b){
            System.out.print(book.getFullDetial()+"\n");
        }
    }
}    
class Library{
    private String title;
    private String author;
    private String isbn;
    public Library(String title,String author,String isbn){
        this.title=title;  
        this.author=author;
        this.isbn=isbn;
    }   
    public Library(){};
    public String getFullDetial(){
        return title+"  : "+author+" : "+isbn;
    }


}
class TestMain{
    public static void main(String args[]){
        Library b1 = new Library("power","abc","5123");
        Library b2 = new Library("secret","xyz","1234");
        Library b3= new Library("karma","ABC","5678");
        collection bk=new collection();
        bk.addBook(b1);
        bk.addBook(b2);
        bk.addBook(b3);
        bk.displaybookdetail();
        System.out.println("_");
        bk.removeBook(b1);
        bk.displaybookdetail();

}
}