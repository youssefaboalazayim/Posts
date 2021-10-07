package com.example.facebookversion2.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebookversion2.R;
import com.example.facebookversion2.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private ArrayList<Post> postArrayList = new ArrayList<>();

    public void setPostArrayList(ArrayList<Post> postArrayList) {
        this.postArrayList = postArrayList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PostsAdapter.PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.PostViewHolder holder, int position) {
        holder.title.setText(postArrayList.get(position).getTitle());
        holder.userId.setText(String.format("%d", postArrayList.get(position).getId()));
        holder.body.setText(postArrayList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }


    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView title, userId, body;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            userId = itemView.findViewById(R.id.userId);
            body = itemView.findViewById(R.id.body);
        }
    }
}

