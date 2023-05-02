package com.car.springbootproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.car.springbootproject.entity.Car;
import com.car.springbootproject.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	
	private CarRepository carRepository;
	
	public CarServiceImpl(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	// service method for retrieve all cars
	
	@Override
	public List<Car> findAll() {
		return carRepository.findAll();
    }
	
}
