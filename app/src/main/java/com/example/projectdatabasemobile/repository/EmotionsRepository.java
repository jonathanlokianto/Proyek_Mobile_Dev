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

    private final EmotionsDao emotionsDao;
    private final ExecutorService executorService;

    public EmotionsRepository(Application application) {
        executorService = Executors.newSingleThreadExecutor();

        EmornalRoomDatabase db = EmornalRoomDatabase.getInstance(application);
        emotionsDao = db.emotionsDao();
    }

    public LiveData<List<Emotions>> getAll(){
        return emotionsDao.getAll();
    }

    public void insert (final Emotions emotions) {
        executorService.execute(()-> emotionsDao.insert(emotions));
    }

    public void update (final Emotions emotions) {
        executorService.execute(()-> emotionsDao.update(emotions));
    }

    public void delete (final Emotions emotions) {
        executorService.execute(()-> emotionsDao.delete(emotions));
    }

}
