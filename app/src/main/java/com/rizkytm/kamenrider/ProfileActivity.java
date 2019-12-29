package com.rizkytm.kamenrider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tvName = findViewById(R.id.nama);
        TextView tvEmail = findViewById(R.id.email);

        tvName.setText("Rizky Tria Meditanala");
        tvEmail.setText("ritrime97@gmail.com");
    }
}
