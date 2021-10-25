package com.example.namelist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button3 = findViewById(R.id.button3);
        final EditText editText1 = findViewById(R.id.editText1);
        TextView textView4 = findViewById(R.id.textView4);
        ListView listview = findViewById(R.id.Listview);
        final List<String> data = new ArrayList<>();
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        listview.setAdapter(stringArrayAdapter);
        button3.setOnClickListener(
            new View.OnClickListener(){

                @Override
                public void onClick(View view){
                    String name = editText1.getText().toString();
                    data.add(name);
                    stringArrayAdapter.notifyDataSetChanged();
                    editText1.setText("");
                }


            }

        );


    }


}