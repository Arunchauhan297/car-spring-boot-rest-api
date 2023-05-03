package com.car.springbootproject.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.car.springbootproject.dto.CarDto;
import com.car.springbootproject.entity.Car;

@Mapper(componentModel = "spring")
public interface CarMapper {
	
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
	
CarDto modelToDto(Car car);
	
	List<CarDto> modelsToDtos(List<Car> cars);
	
	Car dtoToModel(CarDto carDto);
	

}
