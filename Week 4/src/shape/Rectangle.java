package shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType fillType ,double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Rectangle:");
        System.out.println("Color: " + getColor());
        System.out.println("Fill type: " + getFillType());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Area: " + Math.ceil(getWidth()*getHeight()));
    }
}
