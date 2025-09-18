// 9. Online Library System

// A student is trying to issue more books than the limit (say, 3).

// Should you handle it with a business rule check or by throwing a custom exception MaxBooksIssuedException?

// Justify your answer.
// Custom Exception
class MaxBooksIssuedException extends Exception {
    public MaxBooksIssuedException(String msg) {
        super(msg);
    }
}

class Student {
    private String name;
    private int booksIssued = 0;
    private static final int MAX_BOOKS = 3;

    public Student(String name) {
        this.name = name;
    }

    public void issueBook(String bookName) throws MaxBooksIssuedException {
        if (booksIssued >= MAX_BOOKS) {
            throw new MaxBooksIssuedException(name + " has already issued maximum " + MAX_BOOKS + " books.");
        }
        booksIssued++;
        System.out.println( name + " issued book: " + bookName);
    }
} 
class OnlineLibrarySystem {
    public static void main(String args[]) {
        Student s1 = new Student("Sourabh");

        try {
            s1.issueBook("Java Programming");
            s1.issueBook("Data Structures");
            s1.issueBook("Operating Systems");
            s1.issueBook("Database Systems");  
        } 
        catch (MaxBooksIssuedException e) {
          System.out.println("Error: " + e);
        }
    }
}
