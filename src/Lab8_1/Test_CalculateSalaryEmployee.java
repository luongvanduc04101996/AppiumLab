package Lab8_1;

import java.util.ArrayList;
import java.util.List;

public class Test_CalculateSalaryEmployee {
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
    }

    static void calculateSalary (List<Employee> listEmployee){
        for (Employee employee : listEmployee) {
            System.out.printf("Name employee: %s\tWork Times: %.2f\tSalary: %.2f VND\tType: %s\n",
                    employee.getNameEmployee(),employee.getHoursWork(),employee.calculateTotalSalary(),employee.getType());
        }
    }
}
