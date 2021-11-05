import java.util.List;
import model.dao.impl.AuthorDaoImpl;
import model.dao.impl.BookDaoImpl;
import model.entity.Author;
import model.entity.Book;

public class MainHibernate {

  public static void main(String[] args) {
    var bookDao = new BookDaoImpl();

    List<Book> books = bookDao.getAll();

    var authourDao = new AuthorDaoImpl();

    List<Author> authors = authourDao.getAll();

//    System.out.println(books);
//    System.out.println(authors);
  }
}
