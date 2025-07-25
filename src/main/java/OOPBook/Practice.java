package OOPBook;

import java.awt.*;

public class Practice {
    static class Circle {
        double radius;
        Point center;

        public Circle() {
            radius = 1.0;
            center = new Point(0, 0);
        }

        public Circle(double r) {
            radius = r;
            center = new Point(0, 0); // default center
        }

        public Circle(Point center, double r) {
            this(r); // calls Circle(double r)
            this.center = center;
        }

        double findArea() {
            return radius * radius * Math.PI;
        }
    }
}
