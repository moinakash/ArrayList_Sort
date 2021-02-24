package com.example.listviewmarge;

import java.util.Comparator;

public class EmployeeYearComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getYear()-o1.getYear();
    }
}
