package behaviour_parameterization_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<Book> getBooksGreaterThanPages(List<Book> allBooks, int minPages){
        List<Book> books = new ArrayList<>();
        for (Book book : allBooks){
            if(book.getPages() > minPages)
                books.add(book);
        }
        return books;
    }

}
