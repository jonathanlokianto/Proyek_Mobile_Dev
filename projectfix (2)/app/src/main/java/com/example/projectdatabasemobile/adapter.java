package com.example.projectdatabasemobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectdatabasemobile.model.Emotions;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.EmotionsViewHolder> {

    private List<Emotions> emotionsList;

    public adapter() {
        emotionsList = new ArrayList<>();
    }

    public static class EmotionsViewHolder extends RecyclerView.ViewHolder {
        public TextView emotionTextView;

        public EmotionsViewHolder(@NonNull View itemView) {
            super(itemView);
            emotionTextView = itemView.findViewById(R.id.full_name_label);
        }}

    @NonNull
    @Override
    public EmotionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.emotion_layout, parent, false);
        return new EmotionsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmotionsViewHolder holder, int position) {
        Emotions currentEmotion = emotionsList.get(position);
        holder.emotionTextView.setText(currentEmotion.getNama());
    }

    @Override
    public int getItemCount() {
        return emotionsList.size();
    }

    public void setData(List<Emotions> emotions) {
        this.emotionsList = emotions;
        notifyDataSetChanged();
    }
}
