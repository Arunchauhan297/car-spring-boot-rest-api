package com.car.springbootproject.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDto {
	
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String model;
	
	@NotNull
	private String colour;
	
    @NotNull
	private BigDecimal price;
		
}
