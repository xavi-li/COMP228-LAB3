package exercise2;

import java.util.Scanner;

// Ex.2 Driver Class
public class Ex2Main {
    public static void main(String[] args) {
        // flag for user to continue or end the program
        boolean isContinue = true;
        do {
            // user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the game tester name: ");
            String name = scanner.nextLine();
            System.out.println("Is the game tester full-time? (yes/no)");
            String modeOfWork = scanner.nextLine();

            // create the appropriate class
            GameTester gameTester;
            if (modeOfWork.equalsIgnoreCase("yes")) {
                gameTester = new FullTimeGameTester(name);
            } else {
                System.out.println("Enter the number of hours: ");
                double hours = Double.parseDouble(scanner.nextLine());
                gameTester = new PartTimeGameTester(name, hours);
            }

            // display of results
            System.out.println("\nResult");
            System.out.println("===================================");
            System.out.println("Game Tester: " + gameTester.getName());
            System.out.println("Status: " + (gameTester.isFullTime() ? "Full-time" : "Part-time"));
            System.out.println("Salary: $" + gameTester.determineSalary());
            System.out.println("===================================");

            // check if user wants to do this again
            System.out.println("\nContinue? (yes/no)");
            String response = scanner.nextLine();
            if ("no".equalsIgnoreCase(response)) {
                isContinue = false;
                System.out.println("Program end");
            } else {
                isContinue = true;
                System.out.println("");
            }

        } while (isContinue);
    }
}
