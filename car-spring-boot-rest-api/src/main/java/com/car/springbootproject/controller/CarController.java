package com.car.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.springbootproject.dto.CarDto;
import com.car.springbootproject.mapper.CarMapper;
import com.car.springbootproject.service.CarService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor

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
	
	// Create car detail
	
	@PostMapping("/cars")
    public ResponseEntity<CarDto> create(@RequestBody CarDto carDto) {
        carService.saveCar(carMapper.dtoToModel(carDto));

        return ResponseEntity.status(HttpStatus.CREATED).body(carDto);
    }

}
