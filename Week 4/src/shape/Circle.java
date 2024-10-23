package shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.ceil(Math.PI * radius * radius);
    }

    public double calculateCircumference(double pi, double r) {
        return Math.ceil(2 * pi * r);
    }

    public double calculateCircumference(double r) {
        return Math.ceil(2 * Math.PI * r);
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Circle:");
        System.out.println("Color: " + getColor());
        System.out.println("Fill type: " + getFillType());
        System.out.println("Area: " + getArea());
    }

}
