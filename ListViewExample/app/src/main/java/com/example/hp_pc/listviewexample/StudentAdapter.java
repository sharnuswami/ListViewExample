package com.example.hp_pc.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hp-pc on 10-07-2017.
 */

public class StudentAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<StudentModel> list;


    public StudentAdapter(Context context, List<StudentModel> list) {
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public StudentModel getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if (view == null) {

            view = inflater.inflate(R.layout.activity_list_view, parent,false);
        }

        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtAddress = (TextView) view.findViewById(R.id.txtAddress);
        TextView txtAge = (TextView) view.findViewById(R.id.txtAge);

        StudentModel studentModel = list.get(position);

        txtName.setText(studentModel.getName());
        txtAddress.setText(studentModel.getAddress());
        txtAge.setText(studentModel.getAge());


        return view;
    }
}
