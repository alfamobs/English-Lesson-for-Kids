package com.arifudesu.englishlessonforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pelajaran1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelajaran1_1);
    }

    public void next(View view) {
        Intent intent = new Intent(Pelajaran1_1.this, Pelajaran1_2.class);
        startActivity(intent);
    }
}
