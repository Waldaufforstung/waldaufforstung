package com.example.waldaufforstung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {


    public final int Load_Time=1500;//1500milli sekunden, also 1,5sek



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        new Handler().postDelayed(new Runnable() {//Der Handler sagt warte 4sek bis du das ausführst
            @Override
            public void run() {
              Intent intent=new Intent(MainActivity.this, Menu.class)  ;
              startActivity(intent);
              finish();
            }
        },Load_Time);

    }
}