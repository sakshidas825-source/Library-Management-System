import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();

        books.add(new Book(1, "Java Programming", "James Gosling"));
        books.add(new Book(2, "Data Structures", "Mark Allen"));
        books.add(new Book(3, "Operating Systems", "Abraham Silberschatz"));
        books.add(new Book(4, "Database Systems", "Elmasri"));
    }

    public void displayBooks() {

        System.out.println("\n===== Library Inventory =====");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {

                if (!book.isBorrowed()) {

                    book.borrowBook();

                    System.out.println(
                            "Book borrowed successfully."
                    );

                } else {

                    System.out.println(
                            "Book is already borrowed."
                    );
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(int id) {

        for (Book book : books) {

            if (book.getBookId() == id) {

                if (book.isBorrowed()) {

                    book.returnBook();

                    System.out.println(
                            "Book returned successfully."
                    );

                } else {

                    System.out.println(
                            "This book was not borrowed."
                    );
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }
}