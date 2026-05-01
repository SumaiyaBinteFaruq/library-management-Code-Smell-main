package library.management.system;

import java.util.Scanner;

public class ConsoleIO {
    // Step 1: Private static instance
    private static ConsoleIO instance;
    
    // Step 2: Scanner as instance variable
    private final Scanner scanner;

    // Step 3: Private constructor - prevents "new ConsoleIO()"
    private ConsoleIO() {
        this.scanner = new Scanner(System.in);
    }

    // Step 4: Public static method to get the single instance
    public static ConsoleIO getInstance() {
        if (instance == null) {
            instance = new ConsoleIO();
        }
        return instance;
    }

    // Existing methods - unchanged
    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = scanner.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }

    public int readIntInRange(String prompt, int min, int max) {
        while (true) {
            int v = readInt(prompt);
            if (v >= min && v <= max) return v;
            System.out.println("Enter a number between " + min + " and " + max + ".");
        }
    }

    public double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = scanner.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}