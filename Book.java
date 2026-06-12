public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean borrowed;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowBook() {
        borrowed = true;
    }

    public void returnBook() {
        borrowed = false;
    }

    @Override
    public String toString() {
        return "ID: " + bookId +
                " | Title: " + title +
                " | Author: " + author +
                " | Status: " +
                (borrowed ? "Borrowed" : "Available");
    }
}