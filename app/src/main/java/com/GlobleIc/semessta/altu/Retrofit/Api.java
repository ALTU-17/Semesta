package com.GlobleIc.semessta.altu.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static final String url="https://www.semessta.com/";
    private static Retrofit retrofit = null;
    private static Api clientobject;

    public static synchronized Api getInstance()
    {
        if(clientobject==null)
            clientobject=new Api();
        return clientobject;
    }

    public APIInterface getapi()
    {
        return retrofit.create(APIInterface.class);
    }

    public static APIInterface getInfo() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .addHeader("parameter", "value").build();
                return chain.proceed(request);
            }
        });





        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            OkHttpClient okhttpclient = new OkHttpClient.Builder()
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build();



            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okhttpclient).build();

        }

        APIInterface api = retrofit.create(APIInterface.class);

        return api;

    }
}
