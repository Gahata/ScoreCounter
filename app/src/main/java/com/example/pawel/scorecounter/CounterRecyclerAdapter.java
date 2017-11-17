package com.example.pawel.scorecounter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pawel on 14.11.2017.
 */

public class CounterRecyclerAdapter extends RecyclerView.Adapter<CounterRecyclerAdapter.RecentsRecyclerViewHolder> {


    public CounterRecyclerAdapter (){
    }

    @Override
    public CounterRecyclerAdapter.RecentsRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.counter_cardview, parent, false);
        return new RecentsRecyclerViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(CounterRecyclerAdapter.RecentsRecyclerViewHolder holder, int position) {
        holder.nameTextView.setText("0");
        holder.scoreTextView.setText("0");
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class RecentsRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView scoreTextView;


        public RecentsRecyclerViewHolder(final View itemView) {
            super(itemView);
            nameTextView =itemView.findViewById(R.id.title_note_card);
            scoreTextView =itemView.findViewById(R.id.content_preview_note_card);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    //Intent intent = new Intent(itemView.getContext(), NoteActivity.class);
                    //intent.putExtra("NOTE", noteList.get(position));
                    //intent.putExtra("ID", noteList.get(position).getId());
                    //itemView.getContext().startActivity(intent);

                }
            });
        }


    }




}
