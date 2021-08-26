package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class TempActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2);
        getSupportActionBar().hide();
        //Display icon on topBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText etTemperature = (EditText) findViewById(R.id.etTemperature);

        final RadioButton radFtoC = (RadioButton) findViewById(R.id.radFtoC);
        final RadioButton radCtoF = (RadioButton) findViewById(R.id.radCtoF);
        final RadioButton radCtoK = (RadioButton) findViewById(R.id.radCtoK);
        final RadioButton radCtoN = (RadioButton) findViewById(R.id.radCtoN);

        final RadioButton radCtoD = (RadioButton) findViewById(R.id.radCtoD);
        final RadioButton radCtoR = (RadioButton) findViewById(R.id.radCtoR);
        final RadioButton radCtoRe = (RadioButton) findViewById(R.id.radCtoRe);
        final RadioButton radCtoRo = (RadioButton) findViewById(R.id.radCtoRo);

        Button convert =(Button) findViewById(R.id.btnConvert);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When you enter without providing temperature
                if (etTemperature.getText().toString().isEmpty())
                {
                    Toast.makeText(TempActivity2.this, "Hey, Temperature is required !!!", Toast.LENGTH_LONG).show();
                    return;
                }

                double temperatureEntered =Double.parseDouble(etTemperature.getText().toString());

                String result="";
                DecimalFormat tenth = new DecimalFormat("#.#"); //One digit after decimal point


                if(radFtoC.isChecked()) {

                    double convertedTemperature = (temperatureEntered - 32) * 5.0 / 9.0;
                    result = temperatureEntered + " °F" + " is " + tenth.format( convertedTemperature) + " in °C";

                    tvResult.setText(result);

                }
                //FOR C TO F
                if(radCtoF.isChecked()) {

                    double convertedTemperature = (temperatureEntered * 9.0 / 5.0 ) + 32;
                    result = temperatureEntered + " °C" + " is " + tenth.format( convertedTemperature) + " in °F";

                    tvResult.setText(result);

                }
                if(radCtoK.isChecked()) {

                    double convertedTemperature = temperatureEntered + 273.15;
                    result = temperatureEntered + " °C" + " is " + tenth.format(convertedTemperature) + " in °K";

                    tvResult.setText(result);

                }
                if(radCtoN.isChecked()) {

                    double convertedTemperature = temperatureEntered * 0.33000;
                    result = temperatureEntered + " °C" + " is " + tenth.format(convertedTemperature) + " in °N";

                    tvResult.setText(result);

                }
                if(radCtoD.isChecked()) {

                    double convertedTemperature = (100 - temperatureEntered) * 1.5;
                    result = temperatureEntered + " °C" + " is " + tenth.format(convertedTemperature) + " in °De";

                    tvResult.setText(result);

                }
                if(radCtoR.isChecked()) {

                    double convertedTemperature = (temperatureEntered + 273.15) * 1.8;
                    result = temperatureEntered + " °C" + " is " + tenth.format(convertedTemperature) + " in °R";

                    tvResult.setText(result);

                }
                if(radCtoRe.isChecked()) {

                    double convertedTemperature = temperatureEntered * 0.8;
                    result = temperatureEntered + " °C" + " is " + tenth.format(convertedTemperature) + " in °Ré";

                    tvResult.setText(result);

                }
                if(radCtoRo.isChecked()) {

                    double convertedTemperature = temperatureEntered * 0.525 + 7.5;
                    result = temperatureEntered + " °C" + " is " + tenth.format(convertedTemperature) + " in °Rø";

                    tvResult.setText(result);

                }

            }
        });

    }

}