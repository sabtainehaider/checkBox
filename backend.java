package com.example.classparticipation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza, burger, sandwich;
    TextView result;
    Button checkout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = findViewById(R.id.pizza);
        burger = findViewById(R.id.burger);
        sandwich = findViewById(R.id.sandwich);
        checkout = findViewById(R.id.btnOrder);
        result = findViewById(R.id.result);

        result.setVisibility(View.GONE);

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalPrice = 0;

                if (pizza.isChecked()) totalPrice += 1000;
                if (burger.isChecked()) totalPrice += 1200;
                if (sandwich.isChecked()) totalPrice += 500;

                result.setText("Total Amount: " + totalPrice + " Rs");
                result.setVisibility(View.VISIBLE);
            }
        });
    }
}
