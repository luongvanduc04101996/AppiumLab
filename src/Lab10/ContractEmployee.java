package Lab10;

public class ContractEmployee extends Employee {
    private static final double SALARY_PER_HOUR = 40000;
    private static final String TYPE = "Contract Employee";

    public ContractEmployee(String nameEmployee, double hoursWork) {
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
