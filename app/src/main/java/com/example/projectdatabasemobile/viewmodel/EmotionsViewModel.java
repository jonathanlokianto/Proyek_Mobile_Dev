package com.example.projectdatabasemobile.viewmodel;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.projectdatabasemobile.model.Emotions;
import com.example.projectdatabasemobile.repository.EmotionsRepository;

import java.util.List;

public class EmotionsViewModel {

    private final EmotionsRepository emotionsRepository;

    public EmotionsViewModel(Application application) {
        emotionsRepository = new EmotionsRepository(application);
    }

    public LiveData<List<Emotions>> getAll() {
        return emotionsRepository.getAll();
    }

    public void insert (Emotions emotions) {
        emotionsRepository.insert(emotions);
    }

    public void update (Emotions emotions) {
        emotionsRepository.update(emotions);
    }

    public void delete (Emotions emotions) {
        emotionsRepository.delete(emotions);
    }

}
