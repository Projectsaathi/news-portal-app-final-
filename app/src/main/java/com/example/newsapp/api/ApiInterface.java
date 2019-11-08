package com.example.newsapp.api;

import com.example.newsapp.models.Agriculture;
import com.example.newsapp.models.Article;
import com.example.newsapp.models.Finance;
import com.example.newsapp.models.International;
import com.example.newsapp.models.National;
import com.example.newsapp.models.Movie;
import com.example.newsapp.models.Tourism;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/agriculture")
    Call<List<Article>> getArticles();


    @GET("api/national")
    Call<List<National>> getNational();

    @GET("api/international")
    Call<List<International>> getInternational();

    @GET("api/finance")
    Call<List<Finance>> getFinances();

    @GET("api/tourism")
    Call<List<Tourism>> getTourism();


    @GET("api/agriculture")
    Call<List<Agriculture>> getAgriculture();



//    @GET("marvel")
//    Call<List<Movie>> getMovies();

}
