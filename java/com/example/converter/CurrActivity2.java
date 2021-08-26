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

public class CurrActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curr2);

        getSupportActionBar().hide();
       //Display icon on topBar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText edtVal = (EditText) findViewById(R.id.edtVal);

        final RadioButton btnUSD = (RadioButton) findViewById(R.id.btnUSD);
        final RadioButton btnEUR = (RadioButton) findViewById(R.id.btnEUR);
        final RadioButton btnJPY = (RadioButton) findViewById(R.id.btnJPY);
        final RadioButton  btnGBP = (RadioButton) findViewById(R.id.btnGBP);

        final RadioButton btnCHF = (RadioButton) findViewById(R.id.btnCHF);
        final RadioButton btnCAD = (RadioButton) findViewById(R.id.btnCAD);
        final RadioButton btnA = (RadioButton) findViewById(R.id.btnA);
        final RadioButton btnZAR = (RadioButton) findViewById(R.id.btnZAR);

        Button btn =(Button) findViewById(R.id.btn);
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When you enter without providing value
                if (edtVal.getText().toString().isEmpty())
                {
                    Toast.makeText(CurrActivity2.this, "Hey, Rupees is required !!!", Toast.LENGTH_LONG).show();
                    return;
                }
                double CurrEntered =Double.parseDouble(edtVal.getText().toString());

                String result="";
                DecimalFormat tenth = new DecimalFormat(".00"); //One digit after decimal point

                if(btnUSD.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 0.014;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in $";

                    txtResult.setText(result);

                }

                if(btnEUR.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 0.011;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in €";

                    txtResult.setText(result);

                }
                if(btnJPY.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 1.49;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in ¥";

                    txtResult.setText(result);

                }

                if(btnGBP.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 0.0097;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in £";

                    txtResult.setText(result);

                }
                if(btnCHF.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 0.012;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in Fr";

                    txtResult.setText(result);

                }

                if(btnCAD.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 0.017;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in Can$";

                    txtResult.setText(result);

                }
                if(btnA.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 0.018;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in A$ ";

                    txtResult.setText(result);

                }
                if(btnZAR.isChecked()) {
                    if(CurrEntered < 0)
                    {
                        Toast.makeText(CurrActivity2.this,"Hey!!!, Enter Positive value ",Toast.LENGTH_LONG).show();
                        return;
                    }
                    double convertedCurr = CurrEntered * 0.019;
                    result = CurrEntered + " ₹" + " is " +  tenth.format(convertedCurr) + " in R";

                    txtResult.setText(result);

                }
            }
        });
    }
}