package com.paulabetancur.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {


    private RadioButton rCuadro, rCubo, rCirculo, rTriangulo;
    private EditText eL, eL1, eL2, eL3, eR;
    private Button bCalcular;
    private TextView tResult, tL, tL1, tL2, tL3, tR;
    double L=0, L1=0, L2=0, L3=0, Rd=0, p=0, area=0, vol=0, per=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rCuadro = (RadioButton) findViewById( R.id.rCuadro);
        rCubo = (RadioButton) findViewById( R.id.rCubo);
        rCirculo = (RadioButton) findViewById( R.id.rCirculo);
        rTriangulo = (RadioButton) findViewById( R.id.rTriangulo);
        eL = (EditText) findViewById( R.id.eL);
        eL1 = (EditText) findViewById( R.id.eL1);
        eL2 = (EditText) findViewById( R.id.eL2);
        eL3 = (EditText) findViewById( R.id.eL3);
        eR= (EditText) findViewById( R.id.eR);
        bCalcular = (Button) findViewById( R.id.bCalcular);
        tResult = (TextView) findViewById( R.id.tResult);
        tL = (TextView) findViewById( R.id.tL);
        tL1 = (TextView) findViewById( R.id.tL1);
        tL2 = (TextView) findViewById( R.id.tL2);
        tL3 = (TextView) findViewById( R.id.tL3);
        tR = (TextView) findViewById( R.id.tR);






        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(eL.getText().toString().isEmpty() && eL1.getText().toString().isEmpty()
                        && eL2.getText().toString().isEmpty() && eL3.getText().toString().isEmpty() && eR.getText().toString().isEmpty()){
                    tResult.setText("Por favor elija una opción");
                }


                else {

                    if (rCuadro.isChecked()) {

                        L = Integer.parseInt(eL.getText().toString());
                        area = L * L;
                        per = L + L + L + L;
                        tResult.setText("área: " + area + "\nperímetro: " + per);
                    }

                    if (rCubo.isChecked()) {

                        L = Integer.parseInt(eL.getText().toString());
                        vol = L * L * L;
                        area = 6 * L * L;
                        per = 12 * L;
                        tResult.setText("área : " + area + "\nperímetro : " + per + "\nvolumen : " + vol);
                    }

                    if (rCirculo.isChecked()) {


                        Rd = Integer.parseInt(eR.getText().toString());
                        area = Math.PI * Rd * Rd;
                        per = 2 * Math.PI * Rd;
                        tResult.setText("área: " + area + "\nperímetro: " + per);
                    }

                    if (rTriangulo.isChecked()) {


                        L1 = Integer.parseInt(eL1.getText().toString());
                        L2 = Integer.parseInt(eL2.getText().toString());
                        L3 = Integer.parseInt(eL3.getText().toString());
                        p = (L1 + L2 + L3) / 2;
                        area = Math.sqrt(p * (p - L1) * (p - L2) * (p - L3));
                        per = L1 + L2 + L3;
                        tResult.setText("área: " + area + "\nperímetro: " + per);
                    }
                }

            }

            });



}

    public void onRadioButtonClicked(View view) {

        int id = view.getId();

        if (id == R.id.rCuadro){
            eL1.setVisibility(View.GONE);
            eL2.setVisibility(View.GONE);
            eL3.setVisibility(View.GONE);
            eR.setVisibility(View.GONE);
            tL1.setVisibility(View.GONE);
            tL2.setVisibility(View.GONE);
            tL3.setVisibility(View.GONE);
            tR.setVisibility(View.GONE);
            tL.setVisibility(View.VISIBLE);
            eL.setVisibility(View.VISIBLE);

        }

        if (id == R.id.rCirculo){
            eL1.setVisibility(View.GONE);
            eL2.setVisibility(View.GONE);
            eL3.setVisibility(View.GONE);
            eR.setVisibility(View.VISIBLE);
            eL.setVisibility(View.GONE);
            tL1.setVisibility(View.GONE);
            tL2.setVisibility(View.GONE);
            tL3.setVisibility(View.GONE);
            tR.setVisibility(View.VISIBLE);
            tL.setVisibility(View.GONE);
        }

        if (id == R.id.rTriangulo){
            eL1.setVisibility(View.VISIBLE);
            eL2.setVisibility(View.VISIBLE);
            eL3.setVisibility(View.VISIBLE);
            eR.setVisibility(View.GONE);
            eL.setVisibility(View.GONE);
            tL1.setVisibility(View.VISIBLE);
            tL2.setVisibility(View.VISIBLE);
            tL3.setVisibility(View.VISIBLE);
            tR.setVisibility(View.GONE);
            tL.setVisibility(View.GONE);
        }

        if (id == R.id.rCubo){
            eL1.setVisibility(View.GONE);
            eL2.setVisibility(View.GONE);
            eL3.setVisibility(View.GONE);
            eR.setVisibility(View.GONE);
            eL.setVisibility(View.VISIBLE);
            tL1.setVisibility(View.GONE);
            tL2.setVisibility(View.GONE);
            tL3.setVisibility(View.GONE);
            tR.setVisibility(View.GONE);
            tL.setVisibility(View.VISIBLE);

        }

    }
    }




