package web.service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarByNum(int count);
}
