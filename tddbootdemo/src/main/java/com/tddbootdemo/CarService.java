package com.tddbootdemo;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {

        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {
        return carRepository.findByName(name);
    }

    public String greet() {
        return "Hello, World";
    }
}
