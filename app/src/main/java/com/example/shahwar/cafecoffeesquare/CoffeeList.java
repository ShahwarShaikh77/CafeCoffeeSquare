package com.example.shahwar.cafecoffeesquare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class CoffeeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void onCardViewClicked(View v){

       Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.affogato);
        i2.putExtra("resid",R.id.coffeetxt);
        startActivity(i2);
    }
    public void onCardViewClicked1(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newcafelatte);
        startActivity(i2);

    }
    public void onCardViewClicked2(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newcappuccino);
        startActivity(i2);

    }
    public void onCardViewClicked3(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newdoubleespresso);
        startActivity(i2);

    }
    public void onCardViewClicked4(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newespressoshortblack);
        startActivity(i2);

    }
    public void onCardViewClicked5(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newflatwhite);
        startActivity(i2);

    }
    public void onCardViewClicked6(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newlongblack);
        startActivity(i2);

    }
    public void onCardViewClicked7(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newlongmacchiato);
        startActivity(i2);

    }
    public void onCardViewClicked8(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newmochacoffee);
        startActivity(i2);

    }
    public void onCardViewClicked9(View v){
        Intent i2 = new Intent(CoffeeList.this,ItemDesc.class);
        i2.putExtra("resid",R.drawable.newpiccololatte);
        startActivity(i2);

    }





}
