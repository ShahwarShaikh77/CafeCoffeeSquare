package com.example.shahwar.cafecoffeesquare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.icon);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onCoffeeClick(View v){
        /*Toast.makeText(this,"Coffee List",Toast.LENGTH_LONG).show();*/
        Intent i = new Intent(this,CoffeeList.class);
        startActivity(i);

    }
    public void onSnacksClick(View v){
        Intent i3 = new  Intent(MainActivity.this,SnacksList.class);
        startActivity(i3);
    }
    public void onCakeClick(View v){
        Intent i4 = new Intent(MainActivity.this,CakesList.class);
        startActivity(i4);
    }
    public void onSpoonClick(View v){
        Intent i5 = new Intent(MainActivity.this,FoodList.class);
        startActivity(i5);
    }
}
