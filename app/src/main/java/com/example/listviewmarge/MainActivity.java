package com.example.listviewmarge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.listviewmarge.adapters.CustomAdapter;
import com.example.listviewmarge.sortingfiles.FullArrayListSorting;
import com.example.listviewmarge.sortingfiles.ModelClassForSort;
import com.example.listviewmarge.sortingfiles.SalarySorting;
import com.example.listviewmarge.sortingfiles.YearSorting;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button btn;

    ArrayList<ModelClassForSort> dataVals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.idListView);
        btn = findViewById(R.id.idButton);

        dataVals = new ArrayList<ModelClassForSort>();




        dataVals.add(new ModelClassForSort(1997,5666));
        dataVals.add(new ModelClassForSort(1990,4558));
        dataVals.add(new ModelClassForSort(1985,1200));
        dataVals.add(new ModelClassForSort(1985,5000));
        dataVals.add(new ModelClassForSort(1985,4000));
        dataVals.add(new ModelClassForSort(1985,1200));
        dataVals.add(new ModelClassForSort(1987,6000));
        dataVals.add(new ModelClassForSort(1990,4000));
        dataVals.add(new ModelClassForSort(1995,2500));
        dataVals.add(new ModelClassForSort(1997,7500));
        dataVals.add(new ModelClassForSort(2001,3000));
        dataVals.add(new ModelClassForSort(2006,8005));
        dataVals.add(new ModelClassForSort(2006,300));



        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,dataVals);
        listView.setAdapter(customAdapter);





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Start of sorting
                Collections.sort(dataVals, new FullArrayListSorting(
                        new YearSorting(),
                        new SalarySorting())

                );



                CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,dataVals);
                listView.setAdapter(customAdapter);
            }
        });


    }

}