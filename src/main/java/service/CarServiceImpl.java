package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Component
public class CarServiceImpl implements CarService {
    List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "BMW", "Green"));
        carList.add(new Car(2, "Audi", "Black"));
        carList.add(new Car(3, "Lada", "Red"));
        carList.add(new Car(4, "Ford", "White"));
        carList.add(new Car(5, "Mercedes", "Grey"));

    }

    @Override
    public List<Car> carsCount(Integer number) {
        return carList.stream().limit(number).collect(Collectors.toList());
    }
}
