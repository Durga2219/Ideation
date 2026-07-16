public class Book {

    // encapsulation
    private int bookId;
    private String title;
    private String author;
    private boolean issued;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isIssued() {
        return issued;
    }
    public void setIssued(boolean issued) {
        this.issued = issued;
    }
    public void displayBook() {
        System.out.println("------------------------------");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + (issued ? "Issued" : "Available"));
        System.out.println("----------------------------");
    }
}