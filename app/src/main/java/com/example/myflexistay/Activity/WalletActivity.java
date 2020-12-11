package com.example.myflexistay.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myflexistay.Navigation.Categoryscreen;
import com.example.myflexistay.R;

import java.text.NumberFormat;
import java.util.Locale;

public class WalletActivity extends AppCompatActivity {

    TextView wallet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        wallet = findViewById(R.id.wallet_ruppee);

        int total = 100 ;

        Locale locale = new Locale("en","In");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        wallet.setText(fmt.format(total));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(WalletActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();
    }
}