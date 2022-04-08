package learn.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(true);
        System.out.println(true == true);
        System.out.println(false == false);
        System.out.println(true == false);

        boolean flag = true;

        System.out.println(flag == true);
        System.out.println(flag == false);

        while (flag) {
            System.out.println("flag value: " + flag);
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            if (number > 20) {
                flag = false;
                System.out.println("flag value: " + flag);
            }
        }
    }
}
