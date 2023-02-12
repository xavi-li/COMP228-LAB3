package exercise1;

import javax.swing.*;

// Subclass: Health
// describe health insurance
public class Health extends Insurance {
    public Health() {
        super(Ex1Main.TYPE_HEALTH);
    }

    @Override
    public void setInsuranceCost(double amount) {
        monthlyCost = amount;
    }

    @Override
    public void displayInfo() {
        String info = "The monthly cost of " + Ex1Main.TYPE_HEALTH + " Insurance is $" + getMonthlyCost();
        JOptionPane.showMessageDialog(null, info);
    }
}
