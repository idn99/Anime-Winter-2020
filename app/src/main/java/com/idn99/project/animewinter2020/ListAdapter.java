package com.idn99.project.animewinter2020;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.RecyclerViewHolder> {

    private ArrayList<DataAnime> dataAnimes;

    public ListAdapter(ArrayList<DataAnime> dataAnimes) {
        this.dataAnimes = dataAnimes;
    }

    @NonNull
    @Override
    public ListAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.list_design, parent, false);
        return new RecyclerViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.RecyclerViewHolder holder, int position) {
        holder.imageAnime.setImageResource(dataAnimes.get(position).getGambarAnime());
        holder.textJudul.setText(dataAnimes.get(position).getNamaAnime());
        holder.textGenre.setText(dataAnimes.get(position).getGenres());
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return (dataAnimes != null) ? dataAnimes.size() : 0;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout linearLayout;
        private ImageView imageAnime;
        private TextView textJudul, textGenre;
        private int position;

        public RecyclerViewHolder(@NonNull final View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.list_linear_layout);
            imageAnime = itemView.findViewById(R.id.list_image);
            textJudul = itemView.findViewById(R.id.list_judul);
            textGenre = itemView.findViewById(R.id.list_genres);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), DesActivity.class);
                    intent.putExtra("data", dataAnimes.get(position));
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
