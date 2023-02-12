package exercise1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

// Ex.1 Driver class to test the hierarchy
public class Ex1Main {
    final static String TYPE_HEALTH = "Health";
    final static String TYPE_LIFE = "Life";
    final static String EXIT = "Exit";

    public static void main(String[] args) {
        String[] options = {TYPE_HEALTH, TYPE_LIFE, EXIT};

        // define an array of Insurance
        List<Insurance> array = new ArrayList<Insurance>();

        String typeOfInsuranceInput = "";
        double monthlyCostInput;
        int optionSelected = 0;
        Insurance item;
        boolean isContinue = true;
        while (isContinue) {
            // reset var
            typeOfInsuranceInput = "";
            monthlyCostInput = 0.00d;

            // capture user input
            optionSelected = JOptionPane.showOptionDialog(null,
                    "Please choose the Type of Insurance: \n(Click 'Exit' to quit)",
                    "Click a button",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            // digest user input
            if (optionSelected == 0) {
                typeOfInsuranceInput = TYPE_HEALTH;
            } else if (optionSelected == 1) {
                typeOfInsuranceInput = TYPE_LIFE;
            } else if (optionSelected == 2) {
                isContinue = false;
            }

            // input insurance monthly cost
            if (isContinue) {
                monthlyCostInput = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Please input Monthly Cost of " + typeOfInsuranceInput + " Insurance: ",
                        "Input numeric amount",
                        JOptionPane.QUESTION_MESSAGE));
            }

            // create appropriate object, display insurance information, and store in an array
            if (TYPE_HEALTH.equalsIgnoreCase(typeOfInsuranceInput)) {
                item = new Health();
                item.setInsuranceCost(monthlyCostInput);
                item.displayInfo();
                array.add(item);
            } else if (TYPE_LIFE.equalsIgnoreCase(typeOfInsuranceInput)) {
                item = new Life();
                item.setInsuranceCost(monthlyCostInput);
                item.displayInfo();
                array.add(item);
            }
        }
    }
}