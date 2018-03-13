package com.android.cour.menfpapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.cour.menfpapp.model.Ecole;

import java.util.List;

public class EnregistreEcoleActivity extends AppCompatActivity {
    private Button btnval,btnquitter;
    private EditText edtlocal,edtno,edtphone;

    EcoleAdapter arrayAdapter;
    List<Ecole> list;
    Ecole ecole;
    ControleurEcole controleurEcole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enregistre_ecole);

        btnval = (Button) findViewById(R.id.btnVal);
        edtlocal =(EditText) findViewById(R.id.edtlocal);
        edtno =(EditText) findViewById(R.id.edtno);
        edtphone =(EditText) findViewById(R.id.edttelephone);

        btnval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtlocal.getText().toString().trim().equals("") | edtno.getText().toString().trim().equals("") ) {
                    Toast.makeText(getApplication(), "remplisser les champs Obligatoires", Toast.LENGTH_SHORT).show();
                } else {

                    controleurEcole = new ControleurEcole();
                   //ecole = new Ecole();
                    ecole.setLocation(edtlocal.getText().toString());
                    ecole.setLocation(edtno.getText().toString());
                    ecole.setLocation(edtphone.getText().toString());

                    controleurEcole.ajouterEcole(EnregistreEcoleActivity.this, ecole);
                    edtlocal.setText("");
                    edtno.setText("");
                    edtphone.setText("");
                }

            }
        });
    }

}
