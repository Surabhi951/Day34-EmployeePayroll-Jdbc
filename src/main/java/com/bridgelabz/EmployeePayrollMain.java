package com.bridgelabz;

public class EmployeePayrollMain {
    public static void main(String[] args) throws EmployeePayrollException {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.retrieveData().forEach((System.out::println));
    }
}
