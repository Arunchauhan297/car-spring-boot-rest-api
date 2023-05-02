package com.car.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.springbootproject.dto.CarDto;
import com.car.springbootproject.entity.Car;
import com.car.springbootproject.mapper.CarMapper;
import com.car.springbootproject.repository.CarRepository;
import com.car.springbootproject.service.CarService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api")
public class CarController {
	
	@Autowired
	private CarMapper carMapper;
	
	@Autowired
	private CarService carService;
	
	// Api for get all cars details
	
	@GetMapping("/cars")
    public ResponseEntity<List<CarDto>> findAllCars() {
        return ResponseEntity.ok(carMapper.modelsToDtos(carService.findAll()));
    }

}
