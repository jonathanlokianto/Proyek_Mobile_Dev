package com.example.projectdatabasemobile.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.projectdatabasemobile.dao.EmotionsDao;
import com.example.projectdatabasemobile.database.EmornalRoomDatabase;
import com.example.projectdatabasemobile.model.Emotions;
import com.example.projectdatabasemobile.repository.EmotionsRepository;

import java.util.List;

public class EmotionsViewModel extends AndroidViewModel {

    private EmotionsRepository repository;public LiveData<List<Emotions>> allEmotions;

    public EmotionsViewModel(@NonNull Application application) {
        super(application);
        EmotionsDao emotionsDao = EmornalRoomDatabase.getInstance(application).emotionsDao();
        repository = new EmotionsRepository(emotionsDao);
        allEmotions = repository.getAllEmotions();
    }
}
