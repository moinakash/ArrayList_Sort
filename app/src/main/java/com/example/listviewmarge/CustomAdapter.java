package com.example.listviewmarge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.List;

public class CustomAdapter extends ArrayAdapter<Employee> {
    public CustomAdapter(Context context, List<Employee> users) {
        super(context, 0, users);
     }



    //List<JelaArray> posts;

    String jelaName;

    Employee user;

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

     //   String Sectore_name = user.getSectorName();

        // Return the completed view to render on screen
        return convertView;
    }
}
