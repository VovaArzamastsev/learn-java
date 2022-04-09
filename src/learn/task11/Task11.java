package learn.task11;

import learn.util.ScannerUtil;

import java.util.Scanner;

public class Task11 {

    /**
     * Write a program that:
     * 1. Asks the user to enter the size of array of numbers
     * 2. Creates the array of numbers with the size from step 1
     * 3. Enters an endless while loop
     * 4. In the loop it asks the user to enter a number and puts it into the array of numbers
     * 5. If the user entered 100 (code number), the program prints all numbers and finishes
     * 6. If the array is full and the user enters the number that is not 100 (code number) - write an error message that array is full
     * <p>
     * Hint: to solve the task you need to create an additional 'int index = 0' before the loop,
     * and update it inside the loop when the number is added into the array, this 'index' helps you understand if there is still free space in the array
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = ScannerUtil.nextInt(scanner);

        int[] numbers = new int[size];

        int index = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter number: ");
            int numb = ScannerUtil.nextInt(scanner);
            if (numb == 100) {
                flag = false;
                for (int i = 0; i < size; i++) {
                    System.out.println("Numbers[" + i + "] = " + numbers[i]);
                }
            } else {
                if (index == size) {
                    System.err.println("Array is full");
                } else {
                    numbers[index] = numb;
                    index++;
                }
            }
        }
    }
}
