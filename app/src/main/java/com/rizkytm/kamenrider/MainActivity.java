package com.rizkytm.kamenrider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.rizkytm.kamenrider.adapter.ListAdapter;
import com.rizkytm.kamenrider.model.Rider;
import com.rizkytm.kamenrider.model.RidersData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvRiders;
    private ArrayList<Rider> list = new ArrayList<>();

    private String title = "Kamen Rider List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        rvRiders = findViewById(R.id.rv_riders);
        rvRiders.setHasFixedSize(true);

        list.addAll(RidersData.getListData());

        rvRiders.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvRiders.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Rider data) {
                showSelectedRider(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent goToProfile = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(goToProfile);
        return super.onOptionsItemSelected(item);
    }

    private void showSelectedRider(Rider rider) {
        Toast.makeText(this, "Kamu memilih " + rider.getName(), Toast.LENGTH_SHORT).show();
        Intent goToDetail = new Intent(MainActivity.this, DetailActivity.class);
        goToDetail.putExtra(DetailActivity.EXTRA_NAME, rider.getName());
        goToDetail.putExtra(DetailActivity.EXTRA_DESCRIPTION, rider.getDetail());
        goToDetail.putExtra(DetailActivity.EXTRA_IMAGE, rider.getPhoto());
        startActivity(goToDetail);
    }
}
