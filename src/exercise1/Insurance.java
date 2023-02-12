package exercise1;

// Abstract superclass: Insurance
abstract class Insurance {
    protected String typeOfInsurance;
    protected double monthlyCost;

    // Constructor to initialize type of insurance
    public Insurance(String type) {
        this.typeOfInsurance = type;
    }

    // Get method to return type of insurance
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    // Get method to return monthly cost of insurance
    public double getMonthlyCost() {
        return monthlyCost;
    }

    // Abstract method to set cost of insurance
    public abstract void setInsuranceCost(double amount);

    // Abstract method to display insurance information
    public abstract void displayInfo();
}

