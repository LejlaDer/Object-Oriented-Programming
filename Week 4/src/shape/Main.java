package shape;


public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle ("red", FillType.FILLED, 2.1);
        circle.displayInfo();
        System.out.println("Circumference using default PI: " + circle.calculateCircumference(2.4));
        System.out.println("Circumference using PI as parameter: " + circle.calculateCircumference(3.1,2.4));

        System.out.println("\n");

        Rectangle rectangle = new Rectangle("blue" , FillType.NOT_FILLED, 3.5, 2.3);
        rectangle.displayInfo();
    }
}
