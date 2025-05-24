package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
//        car.describeCar();


        System.out.println("make " + car.getMake());
        System.out.println("color " + car.getColor());
        System.out.println("model " + car.getModel());
        System.out.println("door " + car.getDoors());

        car.describeCar();


    }
}