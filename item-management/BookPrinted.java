public class BookPrinted extends Book {
    // instance variables
    private int numPages;
    private Boolean hardcover;

    // constructors
    public BookPrinted(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String edition,
            String category, int numPages,
            Boolean hardcover) {
        super(itemId, title, author, ISBN, publisher, numCopies, edition, category);
        this.numPages = numPages;
        this.hardcover = hardcover;
    }

    // getters and setters
    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(Boolean hardcover) {
        this.hardcover = hardcover;
    }

    // methods
    @Override
    public String toString() {
        return super.toString() + String.format("\nNumber of Pages: %d\nHardcover: %b", numPages, hardcover);
    }
}