package exercise3;

import javax.swing.*;
import java.util.Scanner;

// Ex.3 Driver Class
public class ProcessMortgage {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 3;

        Scanner sc = new Scanner(System.in);
        double interestRate;
        Mortgage[] mortgages = new Mortgage[ARRAY_SIZE]; // an array of 3 mortgages
        int counter = 0;

        // input current interest rate, before go to the loop
        System.out.println("Enter the current interest rate (%):");
        interestRate = sc.nextDouble();

        while (counter < ARRAY_SIZE) {
            // input mortgage info and loop for 3 times
            System.out.println("==================================================");
            System.out.println("Input for the #" + (counter+1) + " mortgage information");
            System.out.println("Enter mortgage type (1 / 2):  [Key: 1 - Business, 2 - Personal]");
            String mortgageType = sc.next();

            System.out.println("Enter mortgage number:");
            String mortgageNumber = sc.next();

            System.out.println("Enter customer name:");
            String customerName = sc.next();

            System.out.println("Enter mortgage amount ($):");
            double mortgageAmount = sc.nextDouble();

            while (mortgageAmount > MortgageConstants.MAX_MORTGAGE_AMOUNT) {
                System.out.println("Mortgage amount cannot exceed $300,000. Please input again:");
                mortgageAmount = sc.nextDouble();
            }

            System.out.println("Enter mortgage term (s / m / l): [Key: s - Short Term, m - Medium Term, l - Long Term]");
            String mortgageTerm = sc.next();

            int termInYears;
            switch (mortgageTerm) {
                case "m":
                case "medium":
                case "medium-term":
                case "Medium Term":
                case "Medium-Term":
                    termInYears = MortgageConstants.MEDIUM_TERM;
                    break;
                case "l":
                case "long":
                case "long-term":
                case "Long Term":
                case "Long-Term":
                    termInYears = MortgageConstants.LONG_TERM;
                    break;
                default: // default case covers "short-term" loan, so don't need to specify a case "short-term"
                    termInYears = MortgageConstants.SHORT_TERM;
            }

            // create appropriate object depends on Mortgage Type
            switch (mortgageType) {
                case "1":
                case "business":
                case "Business":
                    mortgages[counter] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, termInYears);
                    break;
                case "2":
                case "personal":
                case "Personal":
                    mortgages[counter] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, termInYears);
                    break;
            }
            counter++;
        }

        // display of all mortgage information
        System.out.println("==================================================");
        System.out.println("Display of Mortgage information in " + MortgageConstants.BANK_NAME + "\n");
        for (int i=0; i< ARRAY_SIZE; i++) {
            System.out.println("#"+(i+1)+" Mortgage");
            System.out.println(mortgages[i].getMortgageInfo());
        }

    }
}