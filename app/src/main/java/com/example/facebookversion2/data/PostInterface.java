package com.example.facebookversion2.data;

import com.example.facebookversion2.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {

    @GET("posts")

     public Call<List<Post>>getPosts();
}
