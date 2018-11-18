package com.example.pierr.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Boisson extends AppCompatActivity {

    private Button retour;
    private ListView listView;
    String boissons[] = {"Rio", "Nojito", "Mojito", "Ice Tea", "Milk Shake", "Green Smoothie", "Fraisibulle", "Limonade Framboise", "Pink Margarita"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boisson);


        retour = findViewById(R.id.btn_retour);
        listView = findViewById(R.id.lw_boisson);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(Boisson.this, android.R.layout.simple_list_item_1, boissons);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new Choix());


        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    class Choix implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView textView = /*viewGroup.*/findViewById(R.id.tv_boisson_choisi);
            //On prend l'item à la position qu'on a cliqué et on le change en toString.
            textView.setText(parent.getItemAtPosition(position).toString());
            //On récupère le text qu'on a mit dans le textView
            Toast.makeText(Boisson.this,textView.getText().toString(),Toast.LENGTH_SHORT).show();

        }

    }
}

