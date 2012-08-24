package dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao {
  @Autowired
  private DataSource dataSource;
}
