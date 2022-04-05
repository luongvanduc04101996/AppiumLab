package Lab10;

public class FullTimeEmployee extends Employee {
    private static final double SALARY_PER_HOUR = 50000;
    private static final String TYPE = "Full Time Employee";

    public FullTimeEmployee(String nameEmployee, double hoursWork) {
        super(nameEmployee, hoursWork);
    }

    @Override
    protected double salaryPerHour() {
        return SALARY_PER_HOUR;
    }

    @Override
    protected String type() {
        return TYPE;
    }

}
