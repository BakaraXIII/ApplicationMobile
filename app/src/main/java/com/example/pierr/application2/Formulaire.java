package com.example.pierr.application2;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Formulaire extends AppCompatActivity {

    //ddn date de naissance
    /*private TextView nom, prenom,ddn;
    private ContactsContract.CommonDataKinds.Email email;
    private RadioButton sexe;
    private Picture photo;*/
    private Button btnaccueil;
    private Button btnvalidation;
    private AlertDialog.Builder builder= new AlertDialog.Builder();
    private EditText prenom, nom, adresse;
    private RadioButton sexe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);

        //set variable
        btnaccueil = findViewById(R.id.retour);
        btnvalidation= findViewById(R.id.validation);
        prenom = findViewById(R.id.prenom);
        nom = findViewById(R.id.nom);
        adresse = findViewById(R.id.adresse);
        //sexe = findViewById(R.id.radiogroupsex)
        final Intent intent = new Intent().setClass(this, ActivitePrincipale.class);


        //Bouton de validation toast + affichage
        btnvalidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "En train de validé";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,text,duration);
                toast.show();

                //Builder pour l'alert
                builder.setTitle("Fiche renseignement")
                        .setMessage("Prénom : "/* + prenom.getText() +" Nom : " + nom.getText() + "  Adresse : " + adresse.getText()*/)
                        .show();
            }
        });

        //Bouton de retour
        btnaccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });


    }
}

