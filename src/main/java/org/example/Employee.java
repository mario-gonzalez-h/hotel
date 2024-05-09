package org.example;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public double getTotalPay() {
        return (payRate * getRegularHours()) + (1.5 * payRate * getOvertimeHours());
    }

    public int getRegularHours() {
        if (hoursWorked > 40) return 40;
        return hoursWorked;
    }

    public int getOvertimeHours() {
        if (hoursWorked <= 40) return 0;
        return hoursWorked - 40;
    }

    public void resetHours() {
        hoursWorked = 0;
    }

    public void addHours(int hours) {
        hoursWorked += hours;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
