package com.android.example.internshipproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
    ModelClass modelClass=new ModelClass("name", "Some dummy data");
    holder.name.setText(modelClass.name);
    holder.dummy.setText(modelClass.someDummyData);
    holder.heart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int likes=Integer.parseInt(holder.likeCounter.getText().toString());
            likes++;
            holder.likeCounter.setText(String.valueOf(likes));
            Toast.makeText(v.getContext(), "likes "+likes, Toast.LENGTH_SHORT).show();
        }
    });
    holder.share.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Share this!", Toast.LENGTH_SHORT).show();
        }
    });
    holder.comment.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Add a comment", Toast.LENGTH_SHORT).show();
        }
    });
    holder.overflow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Overflow menu clicked", Toast.LENGTH_SHORT).show();
        }
    });
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView overflow;
        ImageView heart;
        ImageView comment;
        ImageView share;
        TextView likeCounter;
        TextView name;
        TextView dummy;
        public MyViewHolder(@NonNull View itemView) {


            super(itemView);
             overflow= itemView.findViewById(R.id.overflow);
            heart= itemView.findViewById(R.id.heart);
            comment= itemView.findViewById(R.id.comment);
            share= itemView.findViewById(R.id.share);
            likeCounter= itemView.findViewById(R.id.likes);
            name=itemView.findViewById(R.id.name);
            dummy=itemView.findViewById(R.id.dummy_content);
        }
    }
}
