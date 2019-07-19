package com.example.shahwar.cafecoffeesquare;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemDesc extends AppCompatActivity {
    ImageView img;
    TextView txtv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_desc);
        img=(ImageView)findViewById(R.id.coffee_img_desc);
        txtv=(TextView) findViewById(R.id.coffeetxt);

        img.setImageResource(getIntent().getIntExtra("img_id",00));
        txtv.setText(getIntent().getStringExtra("nametxt"));

       /* Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            int resid = bundle.getInt("resid");
           img.setImageResource(resid);
            txtv.setText(getIntent().getStringExtra("resid"));


        }*/


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Share on Whatsapp,Facebbook,Twitter", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
