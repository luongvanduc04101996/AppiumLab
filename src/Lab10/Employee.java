package Lab10;

public abstract class Employee {
    private double hoursWork;
    private final String nameEmployee;

    protected abstract double salaryPerHour();

    protected abstract String type();

    public Employee(String nameEmployee, double hoursWork) {
        this.hoursWork = hoursWork;
        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public String getType() {
        return type();
    }

    public double calculateTotalSalary() {
        return hoursWork * salaryPerHour();
    }

    public void addWorkHours(double hoursWork) {
        this.hoursWork += hoursWork;
    }
}
