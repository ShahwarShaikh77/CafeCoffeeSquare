package com.example.shahwar.cafecoffeesquare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FoodList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void onCardViewClicked(View v){
        Intent i2 = new Intent(FoodList.this,ItemDesc.class);
        i2.putExtra("img_id",R.drawable.afgani);
        i2.putExtra("nametxt",R.id.foodtxt);
        startActivity(i2);
    }
    public void onCardViewClicked1(View v){
        Intent i2 = new Intent(FoodList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.chatnichickencurry);
        startActivity(i2);
    }

}
