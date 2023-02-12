package exercise3;

// Abstract class: Mortgage
public abstract class Mortgage implements MortgageConstants {
    private String mortgageNumber;
    private String customerName;
    private double mortgageAmount;
    private double interestRate;
    private int term;

    public Mortgage(String mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        // mortgage amount is not allowed to be over $300,000
        if (mortgageAmount <= MAX_MORTGAGE_AMOUNT) {
            this.mortgageAmount = mortgageAmount;
        } else {
            this.mortgageAmount = MAX_MORTGAGE_AMOUNT;
        }
        this.mortgageAmount = mortgageAmount;
        this.interestRate = interestRate;
        // any mortgage term that is not defined will be set to be SHORT_TERM: one year loan
        if (term != MEDIUM_TERM && term != LONG_TERM) {
            term = SHORT_TERM;
        }
        this.term = term;
    }

    public String getMortgageNumber() {
        return mortgageNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getMortgageAmount() {
        return mortgageAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setInterestRate(double currentPrimeRate) {
        this.interestRate = currentPrimeRate;
    };

    public double getInterest() {
        // Interest Amount = Mortgage Amount * Interest Rate * Mortgage Years
        return mortgageAmount * (getInterestRate()/100) * term;
    }

    public String getMortgageInfo() {
        String infoSummary =  "Mortgage Number: " + mortgageNumber + "\n"
                            + "Customer Name: " + customerName + "\n"
                            + "Mortgage Type: " + this.getClass().getSimpleName() + "\n"
                            + "Mortgage Amount: $" + mortgageAmount + "\n"
                            + "Interest Rate: " + interestRate + "%\n"
                            + "Term: " + term + " years \n"
                            + "Interest: $" + getInterest() + "\n"
                            + "Total Amount: $" + (mortgageAmount+getInterest()) + "\n";
        return infoSummary;
    }
}
