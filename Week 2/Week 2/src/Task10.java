import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 101);
        int userGuess;
        int attemptCount = 0;

        boolean correctGuess = false;

        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            attemptCount++;

            if (userGuess < targetNumber) {
                System.out.println("Too low! This was your attempt number: " + attemptCount);
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! This was your attempt number: " + attemptCount);
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
                correctGuess = true;
            }
        }

        System.out.println("You guessed the number in " + attemptCount + " attempts.");
    }
}
