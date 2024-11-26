package com.example.projectdatabasemobile.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.projectdatabasemobile.dao.EmotionsDao;
import com.example.projectdatabasemobile.database.EmornalRoomDatabase;
import com.example.projectdatabasemobile.model.Emotions;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmotionsRepository {

    private EmotionsDao emotionsDao;

    public EmotionsRepository(EmotionsDao emotionsDao){
        this.emotionsDao = emotionsDao;
    }

    public LiveData<List<Emotions>> getAllEmotions() {
        return emotionsDao.getAll();
    }
}
