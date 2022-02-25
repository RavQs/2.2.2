package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    public CarDaoImpl() {
        carList.add(new Car("Honda", 111, 2000));
        carList.add(new Car("Hyundai", 222, 3000));
        carList.add(new Car("Lada", 333, 1500));
        carList.add(new Car("Mercedes", 1, 1000));
        carList.add(new Car("lamborghini", 1, 500));
    }

    @Override
    public List<Car> getCarByNum(int count) {
        if (count > 5)
            count = 5;
        return carList.subList(0, count);

    }
}
