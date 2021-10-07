package com.example.facebookversion2.ui.main;

//import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.facebookversion2.data.PostInterface;
import com.example.facebookversion2.data.PostsApi;
import com.example.facebookversion2.data.PostsClient;
import com.example.facebookversion2.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PostsViewModel extends ViewModel {

    MutableLiveData<List<Post>> postMutableLiveData = new MutableLiveData<>();

    public void getPosts(){

        PostsApi postsApi = new PostsApi(PostsClient.getINSTANCE().retrofit.create(PostInterface.class));

        postsApi.getPosts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                postMutableLiveData.setValue((response.body()));
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });

//        PostsClient.getINSTANCE().getPosts().enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                postMutableLiveData.setValue((response.body()));
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//
//            }
//        });
    }


}

