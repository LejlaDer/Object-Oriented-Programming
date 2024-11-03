import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter " + i + ". number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Sum is " + sum);
    }
}
