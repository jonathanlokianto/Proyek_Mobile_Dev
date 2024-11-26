//package com.example.projectdatabasemobile.dao;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Delete;
//import androidx.room.Insert;
//import androidx.room.Query;
//import androidx.room.Update;
//
//import com.example.projectdatabasemobile.model.DetailDiary;
//
//import java.util.List;
//
//@Dao
//public interface DetailDiaryDao {
//    @Insert
//    void insert(DetailDiary detailDiary);
//
//    @Update
//    void update(DetailDiary detailDiary);
//
//    @Delete
//    void delete(DetailDiary detailDiary);
//
//    @Query("SELECT * FROM DetailDiary ORDER BY id asc")
//    LiveData<List<DetailDiary>> getAll();
//}
