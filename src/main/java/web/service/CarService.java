package web.service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;

@Service
public interface CarService {
    List<Car> getCarByNum(int count);
    public List<String> getUrlByNum(int count);
}
