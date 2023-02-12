package exercise2;

public class PartTimeGameTester extends GameTester {

    // hourly rate
    int salaryPerHour = 20;
    private double hours;

    // constructor
    public PartTimeGameTester(String name, double hours) {
        super(name, false);
        this.hours = hours;
    }

    // implementation of determineSalary for Part-time Game Tester
    @Override
    public double determineSalary() {
        return hours * salaryPerHour;
    }

    public double getHours() {
        return hours;
    }
}