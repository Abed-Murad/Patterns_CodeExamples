package behaviour_parameterization_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        List<Book> books = getBooks(allBooks, book -> book.getPublicationsName().equals("Diamond")
                && book.getPrice() <= 50
                && book.getPages() < 1000);
    }


    static List<Book> getBooksGreaterThanPages(List<Book> allBooks, int minPages) {
        List<Book> books = new ArrayList<>();
        for (Book book : allBooks) {
            if (book.getPages() > minPages)
                books.add(book);
        }
        return books;
    }

    static List<Book> getBooks(List<Book> allBooks, BookPredicate bookPredicate) {
        List<Book> books = new ArrayList();
        for (Book book : allBooks) {
            if (bookPredicate.acceptBook(book))
                books.add(book);
        }
        return books;
    }


}
