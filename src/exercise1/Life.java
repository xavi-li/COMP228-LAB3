package exercise1;

import javax.swing.*;

// Subclass: Life
// describe life insurance
public class Life extends Insurance {
    public Life() {
        super(Ex1Main.TYPE_LIFE);
    }

    @Override
    public void setInsuranceCost(double amount) {
        monthlyCost = amount;
    }

    @Override
    public void displayInfo() {
        String info = "The monthly cost of " + Ex1Main.TYPE_LIFE + " Insurance is $" + getMonthlyCost();
        JOptionPane.showMessageDialog(null, info);
    }
}