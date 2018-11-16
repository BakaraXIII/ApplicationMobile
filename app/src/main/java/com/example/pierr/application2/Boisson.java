package com.example.pierr.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Boisson extends AppCompatActivity {

    private Button retour;
    private ListView listView;
    String boissons[]= {"Rio","Nojito","Mojito","Ice Tea","Milk Shake","Green Smoothie","Fraisibulle","Limonade Framboise","Pink Margarita"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boisson);

        retour = findViewById(R.id.btn_retour);
        listView = findViewById(R.id.lw_boisson);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,boissons);
        listView.setAdapter(adapter);
        listView.setOnClickListener(new ChoixBoisson());


        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        class ChoixBoisson() implements AdapterView.OnItemClickListener {
            @Override
            public void OnItemClick(AdapterView<?> parent, View view, int position, long id){

            }

        }
    }
}
