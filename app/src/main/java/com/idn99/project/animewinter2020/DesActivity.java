package com.idn99.project.animewinter2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DesActivity extends AppCompatActivity {

    private TextView tvJudul, tvGenres, tvSinopsis;
    private ImageView imgAnime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des);

        DataAnime dataAnime = getIntent().getParcelableExtra("data" );

        inisial();

        tvJudul.setText(dataAnime.getNamaAnime());
        tvGenres.setText(dataAnime.getGenres()+" - "+dataAnime.getJumlahEpisode()+" Episode");
        tvSinopsis.setText(dataAnime.getSinopsis());
        imgAnime.setImageResource(dataAnime.getGambarAnime());
    }

    private void inisial(){
        tvJudul = findViewById(R.id.des_judul);
        tvGenres = findViewById(R.id.des_genres);
        tvSinopsis = findViewById(R.id.des_sinopsis);
        imgAnime = findViewById(R.id.des_image);
    }
}
