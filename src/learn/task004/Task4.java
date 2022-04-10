package learn.task004;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = scanner.nextInt();
        System.out.println("Number value is: " + number);

        System.out.println("Enter string: ");
        scanner.nextLine();

        String str = scanner.nextLine();
        System.out.println("String value is: " + str);
    }
}
