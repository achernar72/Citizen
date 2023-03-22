package carkana.api.cars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import carkana.api.cars.models.Car;

public interface CarRepository extends JpaRepository<Car,Long>{
}
