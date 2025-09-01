package Shapes;

public class Shapes_Main {
    public static void main(String[] args) {
        Shape c = new Circle(3);
        Shape sq = new Square(4);
        Shape t = new Triangle(3, 4, 5);

        System.out.println("Circle area=" + c.area() + ", perim=" + c.perimeter());
        System.out.println("Square area=" + sq.area() + ", perim=" + sq.perimeter());
        System.out.println("Triangle area=" + t.area() + ", perim=" + t.perimeter());
    }
}
