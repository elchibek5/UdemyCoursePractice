package org.example;

public class Car {

    private String make;
    private String model;
    private Color color;
    private int doors;
    private boolean convertible;
    private Engine engine;

    public enum Color {
        BLACK, WHITE, RED, BLUE, PINK, SILVER, GRAY
    }

    public Car() {
        this("BMW", "X7", Color.PINK, 4, true, new Engine("V8", 4.4));
    }

    public Car(String make, String model, Color color, int doors, boolean convertible, Engine engine) {
        setMake(make);
        setModel(model);
        setColor(color);
        setDoors(doors);
        setConvertible(convertible);
        this.engine = engine;
    }

    public void start() {
        if (engine != null) {
            engine.startEngine();
        } else {
            System.out.println("No engine to start.");
        }
    }

    public void stop() {
        if (engine != null) {
            engine.stopEngine();
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            this.make = "Unknown";
            return;
        }

        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "mercedes", "porsche", "tesla", "bmw" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model != null ? model : "Unknown";
    }

    public void setColor(Color color) {
        this.color = color != null ? color : Color.BLACK;
    }

    public void setDoors(int doors) {
        if (doors < 2 || doors > 5) {
            throw new IllegalArgumentException("Invalid number of doors: " + doors);
        }
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                color.name().toLowerCase() + " " +
                make + " " +
                model +
                (convertible ? " Convertible" : "") +
                " with " + engine);
    }

    public static class Engine {
        private String type;
        private double capacity;

        public Engine(String type, double capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public void startEngine() {
            System.out.println("Engine started: " + this);
        }

        public void stopEngine() {
            System.out.println("Engine stopped.");
        }

        @Override
        public String toString() {
            return type + " (" + capacity + "L)";
        }
    }
}