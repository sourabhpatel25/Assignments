/*
Book Library
Create a class Book with fields: title, author, and price.
Use setters to assign values and a method to print book details.
*/
class Book{
    private String title ;
    private String  author;
    private int price;
    public void setvalue(String title ,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    

}
public String settitle(){
    return title;
}
public String setauthor(){
    return author;
}
public int setprice(){
    return price;
}
public void BookDetails(){
    System.out.println("Title        : " + title);
     System.out.println("Author      : " +author);
    System.out.println("Price        : ₹" + price);

}
}

class TestMain{
    public static void main(String args[]){
     Book obj =new Book();
     obj.setvalue("To Kill a Mockingbird" ,"Harper",399);
     obj.BookDetails();
     //getter method
        //System.out.println("\n");
       // System.out.println(obj.gettitle());
        //System.out.println(obj.getauthor());
       // System.out.println(obj.getprice());
    }
    
}