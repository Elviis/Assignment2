package com.example.jonathan.assignment2;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ProvinceActivity extends AppCompatActivity {

    String TAG="";

    //instance of listview
    ListView listView;
    //create list of provinces
    List<Province> provinces;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        provinces = ProvincesData.getList();

        //refrence listview
        listView = (ListView)findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this,R.layout.item_view, provinces);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    class MyAdapter extends ArrayAdapter<Province>{

        List<Province> provinces;

        public MyAdapter(Context context, int resource, List<Province> objects) {
        super(context, resource, objects);
            provinces = objects;

        }

        public View getView(int position, View convertView, ViewGroup parent){

            View view = convertView;

            if(view == null) {

                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.item_view, null);
            }

            //ref items
            TextView name = (TextView) view.findViewById(R.id.province);
            TextView city = (TextView) view.findViewById(R.id.city);
            ImageView flag = (ImageView) view.findViewById(R.id.flag);

            name.setText(provinces.get(position).getName());
            city.setText((provinces.get(position).getCapital()));
            flag.setBackgroundResource(provinces.get(position).getArmId());

            return view;
        }

    }




    }







