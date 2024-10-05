import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number>0)
        {
            System.out.print("Number is positive");
        }
        else
            System.out.print("Number is negative");
    }
}
