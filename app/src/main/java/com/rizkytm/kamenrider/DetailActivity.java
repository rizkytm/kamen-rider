package com.rizkytm.kamenrider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_DESCRIPTION = "extra_description";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_IMAGE = "extra_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView namaKamenRider = findViewById(R.id.nama);
        TextView deskripsiKamenRider = findViewById(R.id.deskripsi);
        ImageView photoKamenRider = findViewById(R.id.photo);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String description = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        int image = getIntent().getIntExtra(EXTRA_IMAGE, 0);

        namaKamenRider.setText(name);
        deskripsiKamenRider.setText(description);
        photoKamenRider.setImageResource(image);
    }
}
