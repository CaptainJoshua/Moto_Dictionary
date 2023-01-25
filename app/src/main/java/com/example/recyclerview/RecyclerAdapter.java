package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.wordsListHolder> {
    private final ArrayList<String> wordsList;
    private final ArrayList<String> detailList;
    private final Context context;

    public RecyclerAdapter(ArrayList<String> wordsList, ArrayList<String> detailList, Context context) {
        this.wordsList = wordsList;
        this.detailList = detailList;
        this.context = context;
    }

    @NonNull
    @Override
    public wordsListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return new wordsListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull wordsListHolder holder, int position) {
        holder.textViewWords.setText(wordsList.get(position));
        holder.textViewDetail.setText(detailList.get(position));
    }

    @Override
    public int getItemCount() {
        return wordsList.size();
    }

    public class wordsListHolder extends RecyclerView.ViewHolder {
        private final TextView textViewWords;
        private final TextView textViewDetail;
        private final CardView cardView;

        public wordsListHolder(@NonNull View itemView) {
            super(itemView);
            textViewWords = itemView.findViewById(R.id.textViewWords);
            textViewDetail = itemView.findViewById(R.id.textViewDetail);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}