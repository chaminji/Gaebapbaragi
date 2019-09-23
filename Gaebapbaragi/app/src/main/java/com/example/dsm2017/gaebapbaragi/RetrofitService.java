package com.example.dsm2017.gaebapbaragi;

import retrofit2.Call;
import retrofit2.http.POST;

public interface RetrofitService {
    @POST("/login")
    Call<String> login();

    @POST("/signup")
    Call<String> signup();

    @POST("/get/pet")
    Call<String> getPet();

    @POST("/get/meal")
    Call<String> getMeal();

    @POST("/get/snack")
    Call<String> getSnack();

    @POST("/get/drug")
    Call<String> getDrug();

    @POST("/insert/pet")
    Call<String> insertPet();

    @POST("/insert/meal")
    Call<String> insertMeal();

    @POST("/insert/snack")
    Call<String> insertSnack();

    @POST("/insert/drug")
    Call<String> insertDrug();

    @POST("/delete/pet")
    Call<String> deletePet();

    @POST("/delete/meal")
    Call<String> deleteMeal();

    @POST("/delete/snack")
    Call<String> deleteSnack();

    @POST("/delete/drug")
    Call<String> deleteDrug();

}