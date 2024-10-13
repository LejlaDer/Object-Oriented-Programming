import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        int sum = calculateSumOfPowers(n);

        System.out.println("The sum is: " + sum);
    }
    public static int calculateSumOfPowers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (int) Math.pow(2, i);
        }
        return sum;
    }
}
