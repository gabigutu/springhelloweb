package com.gabigutu.springhelloweb.dao;

import com.gabigutu.springhelloweb.model.Car;

import java.util.List;

public interface ICarDao {

    int insertCar(Car car);
    void deleteCar(Car car);
    void updateCar(Car car);

    List<Car> selectAllCars();

}
