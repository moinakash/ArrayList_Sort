package com.example.listviewmarge;

public class Employee {

    private int year;
    private int salary;

    public Employee(int year, int salary) {
        this.year = year;
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
