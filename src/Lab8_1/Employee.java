package Lab8_1;

public class Employee {
    private double hoursWork;
    private String nameEmployee;
    private String type;

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public double getHoursWork() {
        return hoursWork;
    }


    public Employee(String nameEmployee, double hoursWork) {
        this.hoursWork = hoursWork;
        this.nameEmployee = nameEmployee;
    }

    public double calculateTotalSalary() {
        return 0;
    }

    public void addWorkHours(double hoursWork) {
        this.hoursWork += hoursWork;
    }
}
