package com.example.myappportfollo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void scores(View v){
        Toast.makeText(this, "This button will lunch my scores app", Toast.LENGTH_SHORT).show();
    }
    public void library(View v){
        Toast.makeText(this,"This button will lunch my library app",Toast.LENGTH_SHORT).show();
    }
    public void build(View v){
        Toast.makeText(this,"This button will lunch my build app",Toast.LENGTH_SHORT).show();
    }
    public void bacon(View v){
        Toast.makeText(this,"This button will lunch my bacon app",Toast.LENGTH_SHORT).show();
    }
    public void capstone(View v){
        Toast.makeText(this,"This button will lunch my capstone app",Toast.LENGTH_SHORT).show();
    }
}
