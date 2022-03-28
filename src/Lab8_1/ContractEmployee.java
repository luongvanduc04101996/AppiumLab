package Lab8_1;

public class ContractEmployee extends Employee {
    private static final double SALARY_PER_HOUR = 40000;
    private static final String TYPE = "Contract Employee";

    public ContractEmployee(String nameEmployee, double hoursWork) {
        super(nameEmployee, hoursWork);
        setType(TYPE);
    }

    @Override
    public double calculateTotalSalary() {
        return super.getHoursWork() * SALARY_PER_HOUR;
    }
}
