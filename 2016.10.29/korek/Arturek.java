package com.pjatk.korek;

/**
 * Created by lukaszlesniewski on 29.10.2016.
 */
public class Arturek {
    public static void main(String[] args) {

        Korek korekDoPjatk = new Korek();
        Car[] cars = {
                new Car("Honda"),
                new Car("Toyota"),
                new Car("Opel")
        };

        korekDoPjatk.cars = cars;

        for (int i = 0; i < cars.length; i++) {
            if (i % 2 == 0)
                System.out.println(cars[i].getName());
        }

        for (Car car : cars) {
            System.out.println(car.getName());
        }

    }
}
