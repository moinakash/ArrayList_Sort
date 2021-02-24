package com.example.listviewmarge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.idListView);

        ArrayList<modelCLass> dataVals = new ArrayList<modelCLass>();

     /*   dataVals.add(new modelCLass(1985,1200));
        dataVals.add(new modelCLass(1987,6000));
        dataVals.add(new modelCLass(1990,4000));
        dataVals.add(new modelCLass(1995,2500));
        dataVals.add(new modelCLass(1997,7500));
        dataVals.add(new modelCLass(2001,3000));
        dataVals.add(new modelCLass(2006,8005));*/

        dataVals.add(new modelCLass(1997,5666));
        dataVals.add(new modelCLass(1990,4558));
        dataVals.add(new modelCLass(1985,1200));
        dataVals.add(new modelCLass(1985,5000));
        dataVals.add(new modelCLass(1985,4000));
        dataVals.add(new modelCLass(1985,1200));
        dataVals.add(new modelCLass(1987,6000));
        dataVals.add(new modelCLass(1990,4000));
        dataVals.add(new modelCLass(1995,2500));
        dataVals.add(new modelCLass(1997,7500));
        dataVals.add(new modelCLass(2001,3000));
        dataVals.add(new modelCLass(2006,8005));


        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,dataVals);
        listView.setAdapter(customAdapter);




    }
}