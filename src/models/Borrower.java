import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
    private String studentId;
    private List<Book> borrowedBooks;

    public Borrower(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.borrow();
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }

    public boolean hasBorrowed(Book book) {
        return borrowedBooks.contains(book);
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return name + " (ID: " + studentId + ")";
    }
}