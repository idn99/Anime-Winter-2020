package com.idn99.project.animewinter2020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataAnime> dataAnimes = new ArrayList<>();
    private ListAdapter listAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_rv);
        addData();

        int jmlKolom = 2;
        listAdapter = new ListAdapter(dataAnimes);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), jmlKolom));
        recyclerView.setAdapter(listAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_design, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addData(){
        dataAnimes.add(new DataAnime("Haikyuu : To The Top", R.drawable.haikyuu, "Sport", "13", R.string.haikyuu));
        dataAnimes.add(new DataAnime("Darwin Games",R.drawable.darwin, "Action", "12", R.string.darwin));
        dataAnimes.add(new DataAnime("Toaru Kagaku no Railgun T",R.drawable.toaru, "Sci-Fi", "25", R.string.toaru));
        dataAnimes.add(new DataAnime("Jibaku Shounen Hanako-kun",R.drawable.hanako, "Mistery", "12", R.string.hanako));
        dataAnimes.add(new DataAnime("In / Spectre",R.drawable.in_spectre, "Mistery", "12", R.string.kyoko_suiri));
        dataAnimes.add(new DataAnime("Bofuri",R.drawable.bofuri, "Adventure", "12", R.string.bofuri));
        dataAnimes.add(new DataAnime("Eizoukenniwa Tewo Dasuna!",R.drawable.eizouken, "Adventure", "12", R.string.eizouken));
        dataAnimes.add(new DataAnime("Somali to Mori no Kami-sama",R.drawable.somali, "Adventure", "12", R.string.somali));
        dataAnimes.add(new DataAnime("Isekai Quartet",R.drawable.isekai, "Comedy", "12", R.string.isekai));
        dataAnimes.add(new DataAnime("ID Invanded",R.drawable.id_invanded, "Sci-Fi", "12", R.string.id_invande));
    }
}
