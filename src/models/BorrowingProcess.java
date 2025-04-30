import java.time.LocalDate;

public class BorrowingProcess {
    private Book book;
    private Borrower borrower;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowingProcess(Book book, Borrower borrower, LocalDate borrowDate) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        book.returnBook();
    }

    @Override
    public String toString() {
        return borrower + " borrowed \"" + book.getTitle() + "\" on " + borrowDate +
               (returnDate != null ? ", returned on " + returnDate : ", not returned yet.");
    }
}