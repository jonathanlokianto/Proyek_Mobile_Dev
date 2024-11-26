//package com.example.projectdatabasemobile.repository;
//
//import android.app.Application;
//
//import androidx.lifecycle.LiveData;
//
//import com.example.projectdatabasemobile.dao.DiaryDao;
//import com.example.projectdatabasemobile.database.EmornalRoomDatabase;
//import com.example.projectdatabasemobile.model.Diary;
//
//import java.util.List;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class DiaryRepository {
//    private final DiaryDao diaryDao;
//
//    private final ExecutorService executorService;
//
//    public DiaryRepository(Application application) {
//        executorService = Executors.newSingleThreadExecutor();
//
//        EmornalRoomDatabase db = EmornalRoomDatabase.getInstance(application);
//        diaryDao = db.diaryDao();
//    }
//
//    public LiveData<List<Diary>> getAll() {
//        return diaryDao.getAll();
//    }
//
//    public void insert (final Diary diary) {executorService.execute(()->diaryDao.insert(diary));}
//    public void delete (final Diary diary) {executorService.execute(()->diaryDao.delete(diary));}
//
//    public void update (final Diary diary) {executorService.execute(()->diaryDao.update(diary));}
//
//}
