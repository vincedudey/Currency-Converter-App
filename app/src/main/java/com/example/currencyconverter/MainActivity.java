package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private static DecimalFormat df = new DecimalFormat("#.##");

    public void convertCurrency(View view){
        EditText editCurrencyText = (EditText)findViewById(R.id.editCurrencyText);
        String str = editCurrencyText.getText().toString();
        double poundsToDollars = Double.valueOf(str)*1.3;
        Toast.makeText(this, "£"+str+" is $"+String.format("%.2f",poundsToDollars), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
