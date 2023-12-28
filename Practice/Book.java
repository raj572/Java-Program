import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize a Book with title, author, and ISBN
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods for title, author, and ISBN
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public static class BookCollection {
        private List<Book> books;

        public BookCollection() {
            this.books = new ArrayList<>();
        }

        // Method to add a book to the collection
        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added to the collection: " + book);
        }

        // Method to remove a book from the collection based on ISBN
        public void removeBook(String isbn) {
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();
                if (book.getIsbn().equals(isbn)) {
                    iterator.remove();
                    System.out.println("Book removed from the collection: " + book);
                    return; // Exit the method after removing the book
                }
            }
            System.out.println("Book with ISBN " + isbn + " not found in the collection.");
        }

        // Method to display all books in the collection
        public void displayBooks() {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Creating a BookCollection
        BookCollection bookCollection = new BookCollection();

        // Adding books to the collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780142437419");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        bookCollection.addBook(book1);
        bookCollection.addBook(book2);

        // Displaying books in the collection
        bookCollection.displayBooks();

        // Removing a book from the collection
        bookCollection.removeBook("9780142437419");

        // Displaying updated collection
        bookCollection.displayBooks();
    }
}
