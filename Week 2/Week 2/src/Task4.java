import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNum = scanner.nextInt();
        int between = firstNum+1;

        System.out.print("Enter second number: ");
        secondNum = scanner.nextInt();

        while (between < secondNum) {
            System.out.println(between);
            between++;
        }

    }
}
