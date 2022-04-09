package learn.util;

import java.util.Scanner;

public interface ScannerUtil {
    static int nextInt(Scanner scanner){
        int nextInt = scanner.nextInt();
        scanner.nextLine();
        return nextInt;
    }
}
