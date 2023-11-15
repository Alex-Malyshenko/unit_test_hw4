
import java.awt.print.Book;
import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
