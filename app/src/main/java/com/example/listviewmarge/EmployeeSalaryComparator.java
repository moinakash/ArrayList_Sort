package com.example.listviewmarge;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {


        Log.e("Salary", ""+(o1.getSalary()-o1.getSalary()));
        return o1.getSalary()-o2.getSalary();
    }
}
