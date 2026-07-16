public class ReferenceBook extends Book {
    private String category;

    // Constructor
    public ReferenceBook(int bookId, String title, String author, String category) {
        super(bookId, title, author);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Category : " + category);
        System.out.println("Note : Reference Books cannot be issued.");
    }
}