package solving_problems;

public class Wall {
    // write code here
    private double width;
    private double height;

    public Wall() {}

    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    //

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;

    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;

    }

    public double getArea() {
        return width * height;
    }
}