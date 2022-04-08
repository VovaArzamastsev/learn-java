package learn.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[2];

        System.out.println("Enter first name: ");
        names[0] = scanner.nextLine();
        System.out.println("First name is: " + names[0]);

        System.out.println();

        System.out.println("Enter second name: ");
        names[1] = scanner.nextLine();
        System.out.println("Second name is: " + names[1]);

        System.out.println();

        System.out.println("You entered: " + names[0] + ", " + names[1]);
    }
}
