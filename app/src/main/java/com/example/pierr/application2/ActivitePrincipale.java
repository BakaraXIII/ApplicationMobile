package com.example.pierr.application2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitePrincipale extends AppCompatActivity {

    private Button btnformulaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("je me suis lancee");
        setContentView(R.layout.activity_main);
        btnformulaire = findViewById(R.id.form);



        btnformulaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creation des intents pour passer d'un activité à l'autre.
                final Intent intent = new Intent().setClass(ActivitePrincipale.this, Formulaire.class);
                intent.putExtra("info","bonjour" );
                startActivity(intent);
                // Le finish fait que l'application se ferme.
                // finish();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
    }
}
