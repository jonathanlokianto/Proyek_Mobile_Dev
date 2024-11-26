//package com.example.projectdatabasemobile.repository;
//
//import android.app.Application;
//
//import androidx.lifecycle.LiveData;
//
//import com.example.projectdatabasemobile.dao.DetailDiaryDao;
//import com.example.projectdatabasemobile.database.EmornalRoomDatabase;
//import com.example.projectdatabasemobile.model.DetailDiary;
//
//import java.util.List;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class DetailDiaryRepository {
//    private final DetailDiaryDao detailDiaryDao;
//
//    private final ExecutorService executorService;
//
//    public DetailDiaryRepository(Application application) {
//        executorService = Executors.newSingleThreadExecutor();
//
//        EmornalRoomDatabase db = EmornalRoomDatabase.getInstance(application);
//        detailDiaryDao = db.detailDiaryDao();
//    }
//
//    public LiveData<List<DetailDiary>> getAll() {
//        return detailDiaryDao.getAll();
//    }
//
//    public void insert (final DetailDiary detailDiary) {executorService.execute(()->detailDiaryDao.insert(detailDiary));}
//    public void update (final DetailDiary detailDiary) {executorService.execute(()->detailDiaryDao.update(detailDiary));}
//    public void delete (final DetailDiary detailDiary) {executorService.execute(()->detailDiaryDao.delete(detailDiary));}
//}
