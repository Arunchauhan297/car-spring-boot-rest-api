package com.car.springbootproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.springbootproject.dto.CarDto;
import com.car.springbootproject.entity.Car;
import com.car.springbootproject.mapper.CarMapper;
import com.car.springbootproject.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {

	@Autowired
	private CarMapper carMapper;
    @Autowired
	private CarService carService;

	// get all cars details

	@GetMapping("/cars")
	public ResponseEntity<List<CarDto>> findAllCars() {
		return ResponseEntity.ok(carMapper.modelsToDtos(carService.findAll()));
	}

	// get car by id

	@GetMapping("/cars/{id}")
	public ResponseEntity<CarDto> findById(@PathVariable long id) {
		Optional<Car> car = carService.findById(id);

		return ResponseEntity.ok(carMapper.modelToDto(car.get()));
	}

	// Create car detail

	@PostMapping("/cars")
	public ResponseEntity<?> createCar(@RequestBody CarDto carDto) {
		carService.saveCar(carMapper.dtoToModel(carDto));

		return ResponseEntity.status(HttpStatus.CREATED).body(carDto);
	}

	@PutMapping("cars/{id}")
	public ResponseEntity<CarDto> updateCar(@PathVariable Long id, @RequestBody CarDto carDto) {
		Car car = carMapper.dtoToModel(carDto);
		car.setId(id);

		carService.saveCar(car);

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(carDto);
	}
	
	@DeleteMapping("cars/{id}")
    public ResponseEntity deleteCar(@PathVariable Long id) {
        carService.deleteById(id);

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}