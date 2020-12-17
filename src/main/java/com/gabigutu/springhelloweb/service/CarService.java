package com.gabigutu.springhelloweb.service;

import com.gabigutu.springhelloweb.dao.ICarDao;
import com.gabigutu.springhelloweb.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final ICarDao iCarDao;

    @Autowired
    public CarService(ICarDao iCarDao) {
        this.iCarDao = iCarDao;
    }

    public int addCar(Car car) {
        return iCarDao.insertCar(car);
    }

    public List<Car> getAllCars() {
        return iCarDao.selectAllCars();
    }

}
