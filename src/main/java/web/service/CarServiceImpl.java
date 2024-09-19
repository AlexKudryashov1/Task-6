package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();

        cars.add(new Car("BMW", 1997, 3));
        cars.add(new Car("Ford", 2000, 1));
        cars.add(new Car("Jeep", 2001, 6));
        cars.add(new Car("Mark", 1999, 2));
        cars.add(new Car("Volvo", 2006, 8));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size() || count < 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
