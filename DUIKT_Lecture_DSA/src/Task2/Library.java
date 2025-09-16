package Task2;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added: " + book.getTitle());
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("\"" + title + "\" was not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("\"" + title + "\" not found.");
    }

    public void showBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " — " + book.getAuthor() +
                    (book.isAvailable() ? " (available)" : " (unavailable)"));
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Head First Java", "Kathy Sierra");
        Book b2 = new Book("Learning Python", "Mark Lutz");

        library.addBook(b1);
        library.addBook(b2);

        library.showBooks();

        library.borrowBook("Head First Java");
        library.showBooks();

        library.returnBook("Head First Java");
        library.showBooks();
    }
}