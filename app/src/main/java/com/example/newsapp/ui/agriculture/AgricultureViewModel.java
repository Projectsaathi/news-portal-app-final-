package com.example.newsapp.ui.agriculture;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.newsapp.api.ApiClient;
import com.example.newsapp.api.ApiInterface;
import com.example.newsapp.models.Agriculture;
import com.example.newsapp.models.Finance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AgricultureViewModel extends ViewModel {

    private MutableLiveData<List<Agriculture>> agricultures;



    public LiveData<List<Agriculture>> getAgriculture() {
        if(agricultures == null){
            agricultures = new MutableLiveData<List<Agriculture>>();
            LoadJson();
        }

        return agricultures;

    }

    public void LoadJson() {

        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Agriculture>> call;
        call = apiInterface.getAgriculture();

        call.enqueue(new Callback<List<Agriculture>>() {
            @Override
            public void onResponse(Call<List<Agriculture>> call, Response<List<Agriculture>> response) {
                Log.d("Success", "onResponse");
                agricultures.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Agriculture>> call, Throwable t) {
                Log.d("error", "onError");
            }
        });
    }
}