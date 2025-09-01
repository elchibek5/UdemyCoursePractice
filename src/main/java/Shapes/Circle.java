package Shapes;

public class Circle extends Shape{
    private final double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * r;
    }

}
