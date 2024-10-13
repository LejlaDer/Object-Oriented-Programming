import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String pass = "hello123";
        String secret = "I love programming!";

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter password");
            input = scanner.nextLine();
        } while (!input.equals(pass));

        System.out.println("Secret is: " + secret);
    }
}
