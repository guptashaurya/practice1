package com.example.shauryagupta.practice1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



class CustomeAdapter extends ArrayAdapter<String> {

    CustomeAdapter(Context context, String[] offices){
        super(context, R.layout.custom_row, offices);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater shauryasInflater = LayoutInflater.from(getContext());
        View customView = shauryasInflater.inflate(R.layout.custom_row, parent, false);

        String singleOfficeItem = getItem(position);
        TextView officeName = (TextView) customView.findViewById(R.id.officeName);
        ImageView officeImage = (ImageView) customView.findViewById(R.id.officeImage);

        officeImage.setImageResource(R.drawable.office1);
        officeName.setText(singleOfficeItem);
        return customView;

    }
}
