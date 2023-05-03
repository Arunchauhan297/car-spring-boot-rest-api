package com.car.springbootproject.service;

import java.util.List;
import java.util.Optional;

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
	
	// service method for find car record by id
	
	@Override
	public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

	// service method for save the car
	
	@Override
	public Car saveCar(Car car) {
		return carRepository.save(car);
	}
	
	// service method for delete the car
	
	@Override
	public void deleteById(Long id) {
		
		carRepository.deleteById(id);
    }
}

