package com.xworkz.task;

import com.xworkz.task.car.Car;
import com.xworkz.task.car.honda.Honda;

public class CarRunner {

    public static void main(String[] args)
    {
        Car car = new Car();
        car.fuelType();
        car.seating();
        car.transmission();

        Honda honda = new Honda();
        honda.fuelType();
        honda.seating();
        honda.transmission();
    }
}
