public class Task3 {
    public static void main(String[] args) {
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int days = 365;

        int secondsInYear = seconds * minutes * hours * days;

        System.out.print("There are " + secondsInYear + " seconds in a year");
    }
}
