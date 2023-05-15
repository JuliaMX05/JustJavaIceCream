package com.example.myapplication;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 3;
        String priceMessage = "Total $ " + price;
        displayMessage(priceMessage + "\nThank you!");
    }


    public void increment(View view) {
        quantity ++;
        display(quantity);
    }

    public void decrement(View view) {
        if(quantity > 0) {
            quantity --;
        }
        display(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String priceMessage) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}