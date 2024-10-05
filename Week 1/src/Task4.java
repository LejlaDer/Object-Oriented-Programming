import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner reader1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = reader1.nextInt();
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int number2 = reader2.nextInt();
        System.out.print("Sum of " + number1 + " and " + number2 + " is " + (number1 + number2));

    }
}
