package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford", "Mustang Shelby", 1968));
        cars.add(new Car("Dodge", "Charger R/T", 1968));
        cars.add(new Car("Chevy", "Chevelle LS6", 1970));
        cars.add(new Car("Pontiac", "GTO Judge", 1969));
        cars.add(new Car("Dodge", "Challenger", 1970));
        return cars.stream().limit(count).toList();
    }
}