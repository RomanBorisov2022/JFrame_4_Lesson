package org.example;

import java.util.ArrayList;
import java.util.List;

class EmployeeDirectory {
    List<Employee> employees = new java.util.ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findByExperience(int requiredExperience) {
        java.util.List<Employee> foundEmployees = new java.util.ArrayList<>();
        for (Employee employee : employees) {
            if (employee.experience == requiredExperience) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }

    public List<String> findPhoneNumbersByName(String requiredName) {
        List<String> phoneNumbers = new java.util.ArrayList<>();
        for (Employee employee : employees) {
            if (employee.name.equals(requiredName)) {
                phoneNumbers.add(employee.phoneNumber);
            }
        }
        return phoneNumbers;
    }

    public Employee findByEmployeeId(int requiredEmployeeId) {
        for (Employee employee : employees) {
            if (employee.employeeId == requiredEmployeeId) {
                return employee;
            }
        }
        return null;
    }
}
