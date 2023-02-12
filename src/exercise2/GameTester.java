package exercise2;

public abstract class GameTester {
    private String name;
    private boolean isFullTime;

    public GameTester(String name, boolean isFullTime) {
        this.name = name;
        this.isFullTime = isFullTime;
    }

    // abstract method
    public abstract double determineSalary();

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return isFullTime;
    }
}