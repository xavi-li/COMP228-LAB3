package exercise3;

// Subclass: PersonalMortgage
public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, (interestRate+2), term); // Personal mortgage interest rate is 2% over current prime rate
    }
}
