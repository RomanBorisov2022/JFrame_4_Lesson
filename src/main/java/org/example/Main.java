package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Adding employees
        directory.addEmployee(new Employee(1, "123-456-7890", "John", 5));
        directory.addEmployee(new Employee(2, "987-654-3210", "Maria", 3));
        directory.addEmployee(new Employee(3, "111-222-3333", "Peter", 7));

        // Finding by experience
        List<Employee> employeesWithExperience5 = directory.findByExperience(5);
        System.out.println("Employees with 5 years of experience: " + employeesWithExperience5);

        // Finding by name
        List<String> phoneNumbersOfMaria = directory.findPhoneNumbersByName("Maria");
        System.out.println("Phone numbers of Maria: " + phoneNumbersOfMaria);

        // Finding by employee ID
        Employee employeeWithId2 = directory.findByEmployeeId(2);
        System.out.println("Employee with employee ID 2: " + employeeWithId2);
    }
}