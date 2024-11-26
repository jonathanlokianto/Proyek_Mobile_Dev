package com.example.projectdatabasemobile.database;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

//import com.example.projectdatabasemobile.dao.DetailDiaryDao;
//import com.example.projectdatabasemobile.dao.DiaryDao;
import com.example.projectdatabasemobile.dao.EmotionsDao;
import com.example.projectdatabasemobile.model.Emotions;

import java.util.concurrent.Executors;

@Database(entities = {Emotions.class}, version = 1)

public abstract class EmornalRoomDatabase extends RoomDatabase {
//  DB NAME
    private static final String DB_NAME = "EmornalRoomDatabase";

//  All the DAO object
    public abstract EmotionsDao emotionsDao();
    //public abstract DiaryDao diaryDao();
    //public abstract DetailDiaryDao detailDiaryDao();

    private static volatile EmornalRoomDatabase INSTANCE;

    public static EmornalRoomDatabase getInstance(final Context context) {
        if(INSTANCE == null){
            synchronized (EmornalRoomDatabase.class){
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        EmornalRoomDatabase.class,
                        DB_NAME)
                        .addCallback(emornalRoomDatabaseCallback)
                        .build();
            }
        }
        return INSTANCE;
    }

    private static final RoomDatabase.Callback emornalRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadExecutor().execute(() -> {
                EmotionsDao dao = INSTANCE.emotionsDao();

                Emotions[] initialEmotions = {
//                      Adding Emotions with each of their intensity

//                      JOY
                        new Emotions("Joy",2 ),
                        new Emotions("Serenity",1 ),
                        new Emotions("Ecstasy",3),
//                      ANGER
                        new Emotions("Anger",2),
                        new Emotions("Annoyance",1 ),
                        new Emotions("Rage",3 ),
//                      ANTICIPATION
                        new Emotions("Anticipation",2 ),
                        new Emotions("Interest",1 ),
                        new Emotions("Vigilance",3 ),
//                      TRUST
                        new Emotions("Trust",2 ),
                        new Emotions("Acceptance",1 ),
                        new Emotions("Admiration",3),
//                      FEAR
                        new Emotions("Fear",2 ),
                        new Emotions("Apprehension",1 ),
                        new Emotions("Terror",3),
//                      SURPRISE
                        new Emotions("Surprise",2 ),
                        new Emotions("Distraction",1 ),
                        new Emotions("Amazement",3),
//                      SADNESS
                        new Emotions("Sadness",2 ),
                        new Emotions("Pensiveness",1 ),
                        new Emotions("Grief",3),
//                      DISGUST
                        new Emotions("Disgust",2 ),
                        new Emotions("Boredom",1 ),
                        new Emotions("Loathing",3),

                };

                dao.insert(initialEmotions);

                int count = dao.getCount();
                Log.d("MyTag", "Jumlah data setelah insert: " + count);
            });
        }
    };
}
