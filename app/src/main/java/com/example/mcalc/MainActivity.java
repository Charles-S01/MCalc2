package com.example.mcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClicked(View v)
    {
        EditText principleBox = (EditText) findViewById(R.id.principleBox);
        String pS = principleBox.getText().toString();
        EditText amortBox = (EditText) findViewById(R.id.amortizationBox);
        String aS = amortBox.getText().toString();
        EditText interestBox = (EditText) findViewById(R.id.interestBox);
        String iS = interestBox.getText().toString();

        MortgageModel myModel;

        myModel = new MortgageModel(pS, aS, iS);
        String payment = myModel.computePayment();

        TextView result = (TextView) findViewById(R.id.result);
        result.setText(payment);

        //        EditText principleBox = (EditText) findViewById(R.id.principleBox);
//        String pS = principleBox.getText().toString();
//        EditText amortBox = (EditText) findViewById(R.id.amortizationBox);
//        String aS = amortBox.getText().toString();
//        EditText interestBox = (EditText) findViewById(R.id.interestBox);
//        String iS = interestBox.getText().toString();
//
//        String payment = MortgageModel.computePayment(iS, aS, pS);
//
//        TextView result = (TextView) findViewById(R.id.result);
//        result.setText(payment + " per month");
    }

}