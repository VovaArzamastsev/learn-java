package learn.later.task9;

import java.util.Scanner;

public class Task9 {
    /**
     * Write a program that creates a String array of size 7. Fill the array with the names of the days of the week.
     * When a program starts, it should ask the user to enter the number from 0 to 6.
     * If the user enters a correct index - display a corresponding day of the week.
     * If the user enters a wrong index - display an error.
     * After that - the program again asks the user to enter the number, and then - displays an error message or the day of the week.
     * <p>
     * If the user entered 100 (code number) - the program stops.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        boolean flag = true;
        while (flag) {
            System.out.println("Enter number from 0 to 6: ");
            int number = scanner.nextInt();
            if (number == 100) {
                flag = false;
                System.out.println("Program finish: ");
            } else {
                if (number < 0 || number > 6) {
                    System.err.println("Wrong index");
                } else {
                    System.out.println(days[number]);
                }
            }
        }
    }
}
