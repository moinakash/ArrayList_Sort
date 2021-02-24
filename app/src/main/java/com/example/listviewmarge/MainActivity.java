package com.example.listviewmarge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button btn;

    ArrayList<Employee> dataVals;
    ArrayList<Employee> dataVals2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.idListView);
        btn = findViewById(R.id.idButton);

        dataVals = new ArrayList<Employee>();
        dataVals2 = new ArrayList<Employee>();

     /*   dataVals.add(new modelCLass(1985,1200));
        dataVals.add(new modelCLass(1987,6000));
        dataVals.add(new modelCLass(1990,4000));
        dataVals.add(new modelCLass(1995,2500));
        dataVals.add(new modelCLass(1997,7500));
        dataVals.add(new modelCLass(2001,3000));
        dataVals.add(new modelCLass(2006,8005));*/

        dataVals.add(new Employee(1997,5666));
        dataVals.add(new Employee(1990,4558));
        dataVals.add(new Employee(1985,1200));
        dataVals.add(new Employee(1985,5000));
        dataVals.add(new Employee(1985,4000));
        dataVals.add(new Employee(1985,1200));
        dataVals.add(new Employee(1987,6000));
        dataVals.add(new Employee(1990,4000));
        dataVals.add(new Employee(1995,2500));
        dataVals.add(new Employee(1997,7500));
        dataVals.add(new Employee(2001,3000));
        dataVals.add(new Employee(2006,8005));

        Collections.sort(dataVals, new EmployeeChainedComparator(
                new EmployeeSalaryComparator(),
                new EmployeeYearComparator())
        );

        for (Employee emp : dataVals) {
            dataVals2.add(emp);
        }



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,dataVals2);
                listView.setAdapter(customAdapter);
            }
        });







    }
}