package exercise2;

public class FullTimeGameTester extends GameTester {

    // fixed rate
    double fixedSalary = 3000d;

    // constructor
    public FullTimeGameTester(String name) {
        super(name, true);
    }

    // implementation of determineSalary for Full-time Game Tester
    @Override
    public double determineSalary() {
        return fixedSalary;
    }
}