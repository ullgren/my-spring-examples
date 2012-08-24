package dao.internal;

import dao.Car;
import dao.CarDao;
import dao.AbstractDao;
import org.springframework.stereotype.Repository;


@Repository("cardao")
public class CarDaoImpl extends AbstractDao implements CarDao {
  public Car findCarBy(String regNo) { return null; }
}

