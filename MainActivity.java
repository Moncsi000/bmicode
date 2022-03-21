package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnszamol;
    private EditText tomeg;
    private EditText magassag;
    private TextView eredmeny;
    private TextView uzenet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViews();


        btnszamol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bmi=0;
                double suly = Double.parseDouble(tomeg.getText().toString());
                double magassag1 = Double.parseDouble(magassag.getText().toString());
                bmi= suly/(magassag1*magassag1);
                uzenet.setText(String.valueOf(bmi));//kiiratás


                if(bmi<20){
                    eredmeny.setText("Sovány vagy");}
                    else if(bmi<25){
                        eredmeny.setText("Normál");
                    }
                    else{
                        eredmeny.setText("Túlsúlyos");
                    }
                }

        });
    }

    private void findViews(){
        btnszamol = findViewById(R.id.button_szamol);
        tomeg = findViewById(R.id.edittext_tomeg);
        magassag = findViewById(R.id.edittext_magassag);
        eredmeny = findViewById(R.id.eredmeny);
        uzenet = findViewById(R.id.uzenet);

    }
}