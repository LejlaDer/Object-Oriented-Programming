import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = reader1.nextInt();
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int number2 = reader2.nextInt();
        if (number1 > number2) {
            System.out.println("The first number is greater than the second.");
        }
        else if (number1 < number2) {
            System.out.println("The first number is smaller than the second.");
        }
        else
            System.out.println("The numbers are equal.");
    }
}
