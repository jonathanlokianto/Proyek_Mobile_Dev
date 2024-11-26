package com.example.projectdatabasemobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectdatabasemobile.database.EmornalRoomDatabase;
import com.example.projectdatabasemobile.databinding.ActivityMainBinding;
import com.example.projectdatabasemobile.model.Emotions;
import com.example.projectdatabasemobile.viewmodel.EmotionsViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EmotionsViewModel emotionsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.emotionsRecyclerView);
        adapter adapter = new adapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        emotionsViewModel = new ViewModelProvider(this).get(EmotionsViewModel.class);
        emotionsViewModel.allEmotions.observe(this, new Observer<List<Emotions>>() {
            @Override
            public void onChanged(List<Emotions> emotions) {
                adapter.setData(emotions);
            }
        });
    }
}