package com.example.siddh.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public void buttonConvert(View view) {

        EditText amount = (EditText) findViewById(R.id.amount);
        EditText rateExchange = (EditText) findViewById(R.id.rateExchange);

        double inramount = Double.parseDouble(amount.getText().toString());
        double exchangerate = Double.parseDouble(rateExchange.getText().toString());

        double dollaramount = inramount * exchangerate;

        Toast.makeText(MainActivity.this, "$ " + String.format("%.2f", dollaramount), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
