package com.example.facebookversion2.data;

import com.example.facebookversion2.model.Post;

import java.util.List;

import retrofit2.Call;

public class PostsApi {
    PostInterface postInterface;

    public PostsApi(PostInterface postInterface) {
        this.postInterface = postInterface;
    }

    public Call<List<Post>> getPosts() {
        return postInterface.getPosts();
    }
}
