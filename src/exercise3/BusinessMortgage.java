package exercise3;

// Subclass: BusinessMortgage
public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, (interestRate+1), term); // Business Mortgage interest rate is 1% over current prime rate
    }
}