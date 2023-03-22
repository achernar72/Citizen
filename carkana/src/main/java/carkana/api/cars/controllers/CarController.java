package carkana.api.cars.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import carkana.api.cars.dao.CarRepository;
import carkana.api.cars.models.Car;

@RestController
@RequestMapping("/cars") 
public class CarController {
	
	@Autowired
	private CarRepository carRepo;
	
	@PostMapping
	public String saveCar(@RequestBody Car car) {
		carRepo.save(car);
		return "Car saved..";
	}
	
	@GetMapping
	public List<Car> getCars() {
		return carRepo.findAll();
	}
}
