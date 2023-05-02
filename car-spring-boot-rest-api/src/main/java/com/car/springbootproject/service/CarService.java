package com.car.springbootproject.service;

import java.util.List;
import java.util.Optional;

import com.car.springbootproject.entity.Car;

public interface CarService {

public List<Car> findAll();
    
    public Car saveCar(Car car);

	Optional<Car> findById(Long id);

	public void deleteById(Long id);
    
}
