package model.dao.impl;

import java.util.List;
import javax.persistence.Query;
import model.DataSourceManager;
import model.dao.BookDao;
import model.entity.Book;
import org.hibernate.Session;

public class BookDaoImpl implements BookDao {

  @Override
  public void create(Book item) {
    var entityManager = DataSourceManager.getInstance().getEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(item);
    entityManager.getTransaction().commit();
  }

  @Override
  public void update(Book item) {

  }

  @Override
  public void delete(Book item) {

  }

  @Override
  public List<Book> getAll() {
    Session session = DataSourceManager.getInstance().getSession();
    Query query = session.createQuery("from Book");

    return query.getResultList();
  }
}
