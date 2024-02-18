import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Library {
        List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        // add a book
        public void addBook (Book book) {
            books.add(book);
        }

        // remove a book
        public void removeBook(String title) {
            Optional<Book> optionalBook = books.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .findFirst();
            if (optionalBook.isPresent()) {
                books.remove(optionalBook.get());
                System.out.println("Book with title '" + title + "' successfully removed." + "\n");
            } else {
                System.out.println("Book with title '" + title + "' does not exist in the library." + "\n");
            }
        }

        // search a book
        public Optional<List<Book>> searchBookByTitle (String title) {
            List<Book> foundBook =  books.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                            .collect(Collectors.toList());
            return Optional.ofNullable(foundBook.isEmpty() ? null : foundBook);
        }

        public  Optional<List <Book>> searchBookByAuthor (String author) {
            List<Book> foundBook =  books.stream()
                    .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
            return Optional.ofNullable(foundBook.isEmpty() ? null : foundBook);
        }

        public Optional<List <Book>> searchBookByGenre (String genre) {
            List<Book> foundBook = books.stream()
                    .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                    .collect(Collectors.toList());
            return Optional.ofNullable(foundBook.isEmpty() ? null : foundBook);
        }

        // display a book
        public List <Book> displayBookSortedByTitle() {
            return books.stream()
                    .sorted((book1, book2) -> book1.getTitle().compareToIgnoreCase(book2.getTitle()))
                    .collect(Collectors.toList());
        }

        public List <Book> displayBookSortedByAuthor() {
            return books.stream()
                    .sorted((book1, book2) -> book1.getAuthor().compareToIgnoreCase(book2.getAuthor()))
                    .collect(Collectors.toList());
        }

        public List <Book> displayBookSortedByYear() {
            return books.stream()
                    .sorted(Comparator.comparingInt(Book::getYear))
                    .collect(Collectors.toList());
        }

        // get average number of publication years
        public double getAvgPublicationYear() {
            return books.stream()
                    .mapToInt(Book::getYear)
                    .average()
                    .orElse(0);
        }

        // find number of total books in the library
        public int numberOfBooks() {
            return books.size();
        }

        // display all books without sorting
        public void retrieveAllBooks() {
            books.forEach(System.out::println);
        }
    }

