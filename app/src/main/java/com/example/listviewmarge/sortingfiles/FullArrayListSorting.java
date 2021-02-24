package com.example.listviewmarge.sortingfiles;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FullArrayListSorting implements Comparator<ModelClassForSort> {

    private List<Comparator<ModelClassForSort>> listComparators;

    public FullArrayListSorting(Comparator<ModelClassForSort>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(ModelClassForSort o1, ModelClassForSort o2) {

        for (Comparator<ModelClassForSort> comparator : listComparators) {
            int result = comparator.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
