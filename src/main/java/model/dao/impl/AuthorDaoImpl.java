package model.dao.impl;

import java.util.List;
import javax.persistence.Query;
import model.DataSourceManager;
import model.dao.AuthorDao;
import model.entity.Author;
import org.hibernate.Session;

public class AuthorDaoImpl implements AuthorDao {

  @Override
  public void create(Author item) {

  }

  @Override
  public void update(Author item) {

  }

  @Override
  public void delete(Author item) {

  }

  @Override
  public List<Author> getAll() {
    Session session = DataSourceManager.getInstance().getSession();
    Query query = session.createQuery("from Author");

    return query.getResultList();
  }
}
