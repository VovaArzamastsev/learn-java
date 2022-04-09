package learn.task10;

import learn.util.ScannerUtil;

import java.util.Scanner;

public class Task10 {

    /**
     * Write a program that:
     * 1. asks the user to enter a number that will define the size of array of names
     * 2. after that the program asks you to enter names - you will put them into the array
     * 3. once all the input is done - display all the names that you have recorded.
     * <p>
     * Hint: use the 'for' cycle
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int numberOfNames = ScannerUtil.nextInt(scanner);

        String[] names = new String[numberOfNames];
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter names[" + i + "] = ");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println("Name[" + i + "]: " + names[i]);
        }
    }
}
