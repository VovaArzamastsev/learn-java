package learn.task007;

import java.util.Scanner;

public class Task7 {
    /**
     * Write a program that creates an array with days of the week (monday, tuesday, wednesday, thursday, friday, saturday, sunday).
     * The program asks you to enter the number from 0 to 6.
     * Based on that number you should take a corresponding day of the week from the array and print it to the console.
     */
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "monday";
        days[1] = "tuesday";
        days[2] = "wednesday";
        days[3] = "thursday";
        days[4] = "friday";
        days[5] = "saturday";
        days[6] = "sunday";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number 0 to 6: ");
        int index = scanner.nextInt();
        if (index < 0 || index > 6) {
            System.out.println("Wrong index");
        } else {
            System.out.println(days[index]);
        }

        System.out.println("Enter a number 0 to 6: ");
        index = scanner.nextInt();
        if (index >= 0 && index <= 6) {
            System.out.println(days[index]);
        } else {
            System.out.println("Wrong index");
        }
    }
}
