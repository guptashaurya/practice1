package com.example.shauryagupta.practice1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;
import android.app.Activity;


public class Activity1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        String[] offices = {"Noida", "GreenPark", "Saket", "Gurgaon"};
        ListView officeListView = (ListView) findViewById(R.id.officeListView);
        ListAdapter shauryasAdapter = new CustomeAdapter(this, offices);
        officeListView.setAdapter(shauryasAdapter);


    }



}
