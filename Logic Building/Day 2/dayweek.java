import java.util.Scanner;

public class dayweek{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                switch (day) {
                    case 1:
                        System.out.println("Monday - Weekday");
                        break;
                    case 2:
                        System.out.println("Tuesday - Weekday");
                        break;
                    case 3:
                        System.out.println("Wednesday - Weekday");
                        break;
                    case 4:
                        System.out.println("Thursday - Weekday");
                        break;
                    case 5:
                        System.out.println("Friday - Weekday");
                        break;
                }
                break;
            case 6:
            case 7:
                switch (day) {
                    case 6:
                        System.out.println("Saturday - Weekend");
                        break;
                    case 7:
                        System.out.println("Sunday - Weekend");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
