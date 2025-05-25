package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
//        car.describeCar();

        car.setMake("ss");
        car.setModel("Banana");
        car.setColor("Black");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("make " + car.getMake());
//        System.out.println("color " + car.getColor());
        System.out.println("model " + car.getModel());
//        System.out.println("door " + car.getDoors());

        car.describeCar();


    }
}