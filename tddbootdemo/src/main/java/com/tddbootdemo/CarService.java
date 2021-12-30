package com.tddbootdemo;

public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {

        this.carRepository = carRepository;
    }

    public Car getCarDetails(String name) {
        Car car =  carRepository.findByName(name);
        if (car == null ) {
            throw new CarNotFoundException();
        }
        return car;
    }
}
