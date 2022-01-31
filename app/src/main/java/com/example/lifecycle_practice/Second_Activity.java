package com.example.lifecycle_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast toast=Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast=Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast=Toast.makeText(this,"onResume",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast=Toast.makeText(this,"onPause",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast=Toast.makeText(this,"onStop",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast=Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast=Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }
}