package Lab8_1;

public class FullTimeEmployee extends Employee {
    private static final double SALARY_PER_HOUR = 50000;
    private static final String TYPE = "Full Time Employee";

    public FullTimeEmployee(String nameEmployee, double hoursWork) {
        super(nameEmployee, hoursWork);
        setType(TYPE);
    }

    @Override
    public double calculateTotalSalary() {
        return super.getHoursWork()*SALARY_PER_HOUR;
    }
}
