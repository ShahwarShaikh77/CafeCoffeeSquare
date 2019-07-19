package com.example.shahwar.cafecoffeesquare;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

public class SnacksList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks_list);


    }
    public void onSnacksList1(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
       i.putExtra("resid",R.drawable.cheesy);
       /* i.putExtra("resid",R.id.snacktxt);*/
        startActivity(i);

    }
    public void onSnacksList2(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.shroom);
        startActivity(i);

    }
    public void onSnacksList3(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.ramen);
        startActivity(i);

    }
    public void onSnacksList4(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.moo);
        startActivity(i);

    }
    public void onSnacksList5(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.blackbean);
        startActivity(i);

    }
    public void onSnacksList6(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.angus);
        startActivity(i);

    }
    public void onSnacksList7(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.classicpotatofries);
        startActivity(i);

    }
    public void onSnacksList8(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.bananafries);
        startActivity(i);

    }
    public void onSnacksList9(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.onion);
        startActivity(i);

    }
    public void onSnacksList10(View v){
        Intent i = new Intent(SnacksList.this,ItemDesc.class);
        i.putExtra("resid",R.drawable.carrot);
        startActivity(i);

    }


}
