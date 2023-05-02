package com.car.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.springbootproject.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
