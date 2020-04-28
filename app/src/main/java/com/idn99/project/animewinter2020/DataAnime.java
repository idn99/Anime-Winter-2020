package com.idn99.project.animewinter2020;

import android.os.Parcel;
import android.os.Parcelable;

public class DataAnime implements Parcelable {
    private String namaAnime;
    private int gambarAnime;
    private String genres;
    private String jumlahEpisode;
    private int sinopsis;

    public DataAnime(String namaAnime, int gambarAnime, String genres, String jumlahEpisode, int sinopsis) {
        this.namaAnime = namaAnime;
        this.gambarAnime = gambarAnime;
        this.genres = genres;
        this.jumlahEpisode = jumlahEpisode;
        this.sinopsis = sinopsis;
    }

    protected DataAnime(Parcel in) {
        namaAnime = in.readString();
        gambarAnime = in.readInt();
        genres = in.readString();
        jumlahEpisode = in.readString();
        sinopsis = in.readInt();
    }

    public static final Creator<DataAnime> CREATOR = new Creator<DataAnime>() {
        @Override
        public DataAnime createFromParcel(Parcel in) {
            return new DataAnime(in);
        }

        @Override
        public DataAnime[] newArray(int size) {
            return new DataAnime[size];
        }
    };

    public String getNamaAnime() {
        return namaAnime;
    }

    public int getGambarAnime() {
        return gambarAnime;
    }

    public String getGenres() {
        return genres;
    }

    public String getJumlahEpisode() {
        return jumlahEpisode;
    }

    public int getSinopsis() {
        return sinopsis;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(namaAnime);
        dest.writeInt(gambarAnime);
        dest.writeString(genres);
        dest.writeString(jumlahEpisode);
        dest.writeInt(sinopsis);
    }
}
