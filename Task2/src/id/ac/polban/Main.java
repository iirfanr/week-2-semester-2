package id.ac.polban;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main {
    public static void main(String[] args) {

        Department it = new Department("IT");
        EmploymentType fullTime = new EmploymentType("Full-Time");

        Employee emp1 = new Employee(1, "Budi", it, fullTime, 5000000);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);

        service.raiseSalary(1, 10);
        Employee emp2 = new Employee(2, "Siti", it, fullTime, 6000000);
        service.addEmployee(emp2);

        service.printEmployeeDetails(emp1);
        service.printEmployeeDetails(emp2);
        System.out.println("Total Karyawan: " + Employee.getEmployeeCount());
    }
}

