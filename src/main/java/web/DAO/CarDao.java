package web.DAO;

import web.Model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarByNum(int count);
}
