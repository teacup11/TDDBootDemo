package com.tddbootdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    private final CarService carService;

    //inject the dependency
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{name}")
    public Car getCar(@PathVariable String name) {
        return carService.getCarDetails(name);
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return carService.greet();
    }

    @RequestMapping("/")
    public @ResponseBody String greet() {
        return "Hello, World";
    }


}
