package com.arifudesu.englishlessonforkids;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("DO YOU WANT TO EXIT ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== R.id.about) {
            startActivity(new Intent(this, AboutActivity.class));
        }
        return true;
    }

    public void pelajaran1(View view){
        Intent intent =  new Intent(HomeActivity.this, Pelajaran1Activity.class);
        startActivity(intent);
    }

    public void pelajaran2(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran2Activity.class);
        startActivity(intent);
    }

    public void pelajaran3(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran3Activity.class);
        startActivity(intent);
    }

    public void pelajaran4(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran4Activity.class);
        startActivity(intent);
    }

    public void pelajaran5(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran5Activity.class);
        startActivity(intent);
    }

    public void pelajaran6(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran6Activity.class);
        startActivity(intent);
    }

    public void pelajaran7(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran7Activity.class);
        startActivity(intent);
    }

    public void pelajaran8(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran8Activity.class);
        startActivity(intent);
    }

    public void pelajaran9(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran9Activity.class);
        startActivity(intent);
    }

    public void pelajaran10(View view){
        Intent intent = new Intent(HomeActivity.this, Pelajaran10Activity.class);
        startActivity(intent);
    }

    public void latihan(View view) {
        Intent intent = new Intent(HomeActivity.this, Latihan.class);
        startActivity(intent);
    }
}
