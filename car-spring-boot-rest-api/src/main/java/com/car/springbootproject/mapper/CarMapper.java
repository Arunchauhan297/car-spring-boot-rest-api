package com.car.springbootproject.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.car.springbootproject.dto.CarDto;
import com.car.springbootproject.entity.Car;

@Mapper
public interface CarMapper {
	
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
	
	//@Mapping(source = "car.desc", target = "description", defaultValue = "description")
	CarDto modelToDto(Car car);
	
	List<CarDto> modelsToDtos(List<Car> cars);
	
	// @Mapping(source = "carDto.description", target = "desc", defaultValue = "description")
	// or
	//@InheritInverseConfiguration
	Car dtoToModel(CarDto carDto);
	

}
