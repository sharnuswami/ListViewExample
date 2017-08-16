package com.example.hp_pc.listviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<StudentModel> list = new ArrayList<>();
        ListView listView = (ListView) findViewById(R.id.listView);

        try {


            for (int i = 0; i < 20; i++) {
                list.add(new StudentModel(i, "Student" + i, "Pune", "22"));
            }

            StudentAdapter adapter = new StudentAdapter(this, list);
            listView.setAdapter(adapter);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
