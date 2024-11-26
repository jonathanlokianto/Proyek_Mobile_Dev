package com.example.projectdatabasemobile.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Emotions")
public class Emotions implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "intensity")
    private int intensity;

    @Ignore
    public Emotions() {
    }

    public Emotions(String nama, int intensity) {
        this.nama = nama;
        this.intensity = intensity;
    }

    protected Emotions(Parcel in) {
        id = in.readInt();
        nama = in.readString();
        intensity = in.readInt();
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int i) {
        dest.writeInt(id);
        dest.writeString(nama);
        dest.writeInt(intensity);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Emotions> CREATOR = new Creator<Emotions>() {
        @Override
        public Emotions createFromParcel(Parcel in) {
            return new Emotions(in);
        }

        @Override
        public Emotions[] newArray(int size) {
            return new Emotions[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }
}
