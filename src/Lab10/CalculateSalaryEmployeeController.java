package Lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateSalaryEmployeeController {
    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<>();
        Employee employee1 = new ContractEmployee("Duc 1", 10);
        Employee employee2 = new FullTimeEmployee("Duc 2", 10);
        Employee employee3 = new FullTimeEmployee("Duc 3", 10);
        employee3.addWorkHours(10);

        listEmployee.add(employee1);
        listEmployee.add(employee2);
        listEmployee.add(employee3);
        calculateSalary(listEmployee);
        System.out.println("--------------------------------");
        calculateSalary(Arrays.asList());
    }

    static void calculateSalary(List<Employee> listEmployee) {
        if (listEmployee == null || listEmployee.size() == 0) {
            throw new IllegalArgumentException("The list does not have any employees");
        } else {
            for (Employee employee : listEmployee) {
                System.out.printf("Name employee: %s\tWork Times: %.2f\tSalary: %.2f VND\tType: %s\n",
                        employee.getNameEmployee(), employee.getHoursWork(), employee.calculateTotalSalary(), employee.getType());
            }
        }
    }
}
