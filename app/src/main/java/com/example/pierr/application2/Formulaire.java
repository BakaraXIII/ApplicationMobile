package com.example.pierr.application2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Formulaire extends AppCompatActivity {

    //ddn date de naissance
    /*private TextView nom, prenom,ddn;
    private ContactsContract.CommonDataKinds.Email email;
    private RadioButton sexe;
    private Picture photo;*/
    private Button btnaccueil;
    private Button btnvalidation;
    private EditText prenom, nom, adresse;
    private RadioGroup grpsexe;
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
        grpsexe = findViewById(R.id.radiogroupsex);

        final Intent intent = new Intent().setClass(this, ActivitePrincipale.class);


        //Bouton de validation toast + affichage
        btnvalidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //set des variables des toasters;
                Context context = getApplicationContext();
                CharSequence text;
                int duration = Toast.LENGTH_SHORT;


                //on vérifie si le sexe à été renseigné
                int checkRadioButtonId = grpsexe.getCheckedRadioButtonId();
                if (checkRadioButtonId == -1){

                    text = "pas de sexe validé";
                    Toast toast = Toast.makeText(context,text,duration);
                    toast.show();
                }
                else{
                    sexe = findViewById(checkRadioButtonId);
                }
                text = "creation Alerte";
                Toast toast = Toast.makeText(context,text,duration);
                toast.show();

                //Builder pour l'alert
                AlertDialog.Builder a_builder = new AlertDialog.Builder(Formulaire.this);
                a_builder.setMessage("Prénom : " + prenom.getText() +" Nom : " + nom.getText() + "  Adresse : " + adresse.getText())
                        .setCancelable(false)
                        .setPositiveButton("Revenir à l'accueil ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("Formulaire", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = a_builder.create();
                alertDialog.setTitle("Titre Alerte");
                alertDialog.show();

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

