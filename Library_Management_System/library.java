import java.util.ArrayList;

public class library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;
    // Constructor
    public library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully!");
    }
    public void issueBook(int bookId) throws BookNotAvailableException {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                    if (book instanceof ReferenceBook) {
                        System.out.println("Reference Books cannot be issued.");
                        return;
                    }
                if (book.isIssued()) {
                    throw new BookNotAvailableException(
                            "Book is already issued.");
                }

                book.setIssued(true);
                System.out.println("Book issued successfully!");
                return;
            }
        }

        System.out.println("Book not found.");
    }
    public void returnBook(int bookId) throws BookNotIssuedException {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (!book.isIssued()) {
                    throw new BookNotIssuedException(
                            "Book was not issued.");
                }

                book.setIssued(false);
                System.out.println("Book returned successfully!");
                return;
            }
        }

        System.out.println("Book not found.");
    }
    public void displayAvailableBooks() {

        System.out.println("\nAvailable Books ");

        boolean found = false;

        for (Book book : books) {

            if (!book.isIssued()) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books available.");
        }
    }
    public void displayMembers() {

        System.out.println("\nMembers ");

        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }

        for (Member member : members) {
            member.displayMember();
        }
    }
}