package com.example.projectdatabasemobile.database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.projectdatabasemobile.dao.EmotionsDao;

public abstract class EmornalRoomDatabase extends RoomDatabase {

    private static final String DB_NAME = "EmornalRoomDatabase";

    public abstract EmotionsDao emotionsDao();

    private static volatile EmornalRoomDatabase INSTANCE;

    public static EmornalRoomDatabase getInstance(final Context context) {
        if(INSTANCE == null){
            synchronized (EmornalRoomDatabase.class){
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        EmornalRoomDatabase.class,
                        DB_NAME).build();
            }
        }
        return INSTANCE;
    }

}
