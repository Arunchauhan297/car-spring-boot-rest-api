package com.car.springbootproject.service;

import java.util.List;
import com.car.springbootproject.entity.Car;

public interface CarService {

    public List<Car> findAll();
    
    public Car saveCar(Car car);

    
}
