package com.car.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.car.springbootproject.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
