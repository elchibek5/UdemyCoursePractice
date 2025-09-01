package Shapes;

public class Square extends Shape {
    private final double s;

    Square(double s) {
        this.s = s;
    }

    @Override
    double area() {
        return s * s;
    }

    @Override
    double perimeter() {
        return s * 4;
    }

}
