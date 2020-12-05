package com.example.myflexistay.Navigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myflexistay.Activity.MainActivity;
import com.example.myflexistay.R;

public class Profilescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilescreen);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(Profilescreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}