import java.util.List;
import java.util.Optional;

public class ManageBooks {
    public static void main (String[] args) {
        Library lib = new Library();

        // call addBook method
        lib.addBook(new Book("The Idiot", "Fyodor Dostoyevsky", "Fiction", 1868));
        lib.addBook(new Book("Da Vinci Code", "Dan Brown", "Mystery", 2003));
        lib.addBook(new Book("Little Answer to Big Questions", "Stephen Hawking", "Non-fiction", 2018));
        lib.addBook(new Book("Crime and Punishment", "Fyodor Dostoyevsky", "Fiction", 1866));
        lib.addBook(new Book("Oliver Twist Summary", "Charles Dickens", "Adventure", 1838));

        // retrieve all books without sorting
        System.out.println("Here is the list of all books in the library: ");
        lib.retrieveAllBooks();
        System.out.println();

        // search books by title
        String searchTitle = "Da Vinci Code";
        System.out.println("Searched book with title - " + searchTitle + ":");
        Optional<List<Book>> searchedBookByTitle = lib.searchBookByTitle(searchTitle);
        if (searchedBookByTitle.isPresent()) {
            searchedBookByTitle.get().forEach(System.out::println);
        } else {
            System.out.println("The book with title '" + searchTitle + "' not found.");
        }
        System.out.println();

        // search books by author
        String searchAuthor = "Fyodor Dostoyevsky";
        System.out.println("Searched book with author - " + searchAuthor + ":");
        Optional<List<Book>> searchedBookByAuthor = lib.searchBookByAuthor(searchAuthor);
        if (searchedBookByAuthor.isPresent()) {
            searchedBookByAuthor.get().forEach(System.out::println);
        } else {
            System.out.println("The book with author '" + searchAuthor + "' not found.");
        }
        System.out.println();

        // search books by genre
        String searchGenre = "fiction";
        System.out.println("Searched book with genre - " + searchGenre + ":");
        Optional<List<Book>> searchedBookByGenre = lib.searchBookByGenre(searchGenre);
        if (searchedBookByGenre.isPresent()) {
            searchedBookByGenre.get().forEach(System.out::println);
        } else {
            System.out.println("The book with genre '" + searchGenre + "' not found.");
        }
        System.out.println();

        // display all books sorted by title
        System.out.println("All books sorted by title:");
        lib.displayBookSortedByTitle().forEach(System.out::println);
        System.out.println();

        // display all books sorted by author
        System.out.println("All books sorted by author:");
        lib.displayBookSortedByAuthor().forEach(System.out::println);
        System.out.println();

        // display all books sorted by publication year
        System.out.println("All books sorted by publication year:");
        lib.displayBookSortedByYear().forEach(System.out::println);
        System.out.println();

        // calculate avg publication year
        System.out.println("Average publication year of the books in the library: " + lib.getAvgPublicationYear() + "\n");

        // total number of book in the library
        System.out.println("Total number of the books in the library: " + lib.numberOfBooks()+ "\n");

        // remove book from library list
        String titleToRemove = "Little Answer to Big Questions";
        lib.removeBook(titleToRemove);

        System.out.println("Display all books after removal:");
        lib.retrieveAllBooks();
    }
}
