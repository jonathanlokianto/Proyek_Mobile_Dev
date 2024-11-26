//package com.example.projectdatabasemobile.model;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import androidx.annotation.NonNull;
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//import androidx.room.PrimaryKey;
//
//import java.util.Date;
//
//@Entity (tableName = "Diary")
//public class Diary implements Parcelable {
//
//    @PrimaryKey(autoGenerate = true)
//    @ColumnInfo(name = "id")
//    private int id;
//    @ColumnInfo(name = "tanggal")
//    private Date tanggal;
//
//    @ColumnInfo(name = "note")
//    private String note;
//
//    protected Diary(Parcel in) {
//        id = in.readInt();
//        note = in.readString();
//    }
//
//    public static final Creator<Diary> CREATOR = new Creator<Diary>() {
//        @Override
//        public Diary createFromParcel(Parcel in) {
//            return new Diary(in);
//        }
//
//        @Override
//        public Diary[] newArray(int size) {
//            return new Diary[size];
//        }
//    };
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(@NonNull Parcel dest, int flags) {
//        dest.writeInt(id);
//        dest.writeString(note);
//    }
//}
