package com.example.woodboxapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class CommodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commode);
        BottomNavigationView navigationView =findViewById(R.id.bottom_nav);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id= menuItem.getItemId();
                // map activity pour aller vers le module de geolocalisation
                if ((id==R.id.bm_map)){
                    Intent mapIntent = new Intent(getApplicationContext(),MapActivity.class);
                    startActivity(mapIntent);
                }
                //main activity pouyr aller vers le catalogue de produits
                if (id==R.id.bm_home){
                    Intent homeIntent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(homeIntent);
                }
                return false;
            }
        });

    }
}
