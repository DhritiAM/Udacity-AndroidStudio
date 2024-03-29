package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        String priceMessage = "Your total is Rs." + (quantity*25) + "\nThank You!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    public void increment(View view){
        quantity = quantity + 1;
        display(quantity);
        String message = "Rs." + (quantity*25);
        displayMessage(message);
    }

    public void decrement(View view){
        if(quantity>0) {
            quantity = quantity - 1;
            display(quantity);
            String message = "Rs." + (quantity*25);
            displayMessage(message);
        }
    }

    private void displayMessage(String message){
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
