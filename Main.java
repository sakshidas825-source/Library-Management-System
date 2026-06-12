import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    library.displayBooks();
                    break;

                case 2:
                    System.out.print(
                            "Enter Book ID to Borrow: "
                    );
                    int borrowId = scanner.nextInt();
                    library.borrowBook(borrowId);
                    break;

                case 3:
                    System.out.print(
                            "Enter Book ID to Return: "
                    );
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;

                case 4:
                    System.out.println(
                            "Exiting Library System..."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid Choice!"
                    );
            }

        } while (choice != 4);

        scanner.close();
    }
}