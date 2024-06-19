public class PeriodicalPrinted extends Periodical {
    // instance variables
    private int numPages;

    // constructors
    public PeriodicalPrinted(String itemId, String title, Author author, String ISBN, String publisher,
            int numCopies,
            String issueNumber, String publicationDate,
            String frequency, int numPages) {
        super(itemId, title, author, ISBN, publisher, numCopies, issueNumber, publicationDate, frequency);
        this.numPages = numPages;
    }

    // getters and setters
    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // methods
    @Override
    public String toString() {
        return super.toString() + String.format("Number of Pages: %s", numPages);
    }
}