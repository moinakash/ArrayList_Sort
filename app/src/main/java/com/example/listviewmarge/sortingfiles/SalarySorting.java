package com.example.listviewmarge.sortingfiles;

import android.util.Log;

import java.util.Comparator;

public class SalarySorting implements Comparator<ModelClassForSort> {

    @Override
    public int compare(ModelClassForSort o1, ModelClassForSort o2) {


        Log.e("Salary", ""+(o1.getSalary()-o1.getSalary()));
        return o1.getSalary()-o2.getSalary();
    }
}
