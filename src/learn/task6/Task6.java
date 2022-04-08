package learn.task6;

import java.util.Scanner;

public class Task6 {
    /**
     * Write a program that reads a number from the console and stores it into variable 'int number1',
     * reads a second number from the console and stores it into variable 'int number2'.
     * <p>
     * Then, if number1 is less than number2, write to console 'Number 1 is smaller: ' + number1.
     * If number 2 is less than number 1, write to console 'Number 2 is smaller: ' + number2.
     * Else, write 'First number equals to second number.'
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Number1: " + number1);
        int number2 = scanner.nextInt();
        System.out.println("Number2: " + number2);
        if (number1 < number2) {
            System.out.println("Number1 low: " + number1);
        } else if (number2 < number1) {
            System.out.println("Number2 low:" + number2);
        } else {
            System.out.println("First number = Second number");
        }

    }
}
