package com.example.iveci.mad3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void ontheClick(View v) {
        if (v.getId() == R.id.act1) {
            Intent a = new Intent(MainMenu.this, MainActivity.class);
            startActivity(a);
        }
    }
}
