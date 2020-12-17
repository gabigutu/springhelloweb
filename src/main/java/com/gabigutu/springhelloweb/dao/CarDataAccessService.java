package com.gabigutu.springhelloweb.dao;

import com.gabigutu.springhelloweb.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDataAccessService implements ICarDao {

    private List<Car> cars = new ArrayList<>();

    @Override
    public int insertCar(Car car) {
        cars.add(new Car(car.getName()));
        // update database
        return 0;
    }

    @Override
    public void deleteCar(Car car) {
        cars.remove(car);
    }

    @Override
    public void updateCar(Car car) {
        int index = cars.indexOf(car);
        cars.get(index);
    }

    @Override
    public List<Car> selectAllCars() {
        return cars;
    }


}
