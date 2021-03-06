package com.example.listviewmarge.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.listviewmarge.R;
import com.example.listviewmarge.sortingfiles.ModelClassForSort;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<ModelClassForSort> {
    public CustomAdapter(Context context, List<ModelClassForSort> users) {
        super(context, 0, users);
     }



    //List<JelaArray> posts;

    String jelaName;

    ModelClassForSort user;

    TextView tvYear, tvSalary;

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.items, parent, false);
        }


          user = getItem(position);


         tvYear = (TextView) convertView.findViewById(R.id.idYear);
         tvSalary = (TextView) convertView.findViewById(R.id.idSalary);



         tvYear.setText(""+user.getYear());
         tvSalary.setText(""+user.getSalary());

//         Toast.makeText(getContext(), ""+user.getYear(), Toast.LENGTH_SHORT).show();
//         Toast.makeText(getContext(), ""+user.getSalary(), Toast.LENGTH_SHORT).show();

     //   String Sectore_name = user.getSectorName();

        // Return the completed view to render on screen
        return convertView;
    }
}
