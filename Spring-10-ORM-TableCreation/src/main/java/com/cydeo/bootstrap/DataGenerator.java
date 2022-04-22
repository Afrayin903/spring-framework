package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //put @Repository annotation if @Component does not work
public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car car1 = new Car("Toyota", "RAW4");
        Car car2 = new Car("Nissan", "Mura");
        Car car3 = new Car("Toyota", "Corolla");

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);
    }

}
