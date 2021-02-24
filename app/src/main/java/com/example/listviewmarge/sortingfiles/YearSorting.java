package com.example.listviewmarge.sortingfiles;

import java.util.Comparator;

public class YearSorting implements Comparator<ModelClassForSort> {
    @Override
    public int compare(ModelClassForSort o1, ModelClassForSort o2) {
        return o1.getYear()-o2.getYear();
    }
}
