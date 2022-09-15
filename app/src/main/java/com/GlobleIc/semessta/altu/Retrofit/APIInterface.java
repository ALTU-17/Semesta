package com.GlobleIc.semessta.altu.Retrofit;

import com.GlobleIc.semessta.altu.ProductsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {

    @GET("getpr.php")
    Call<List<ProductsModel>> GetData(

    );

}
