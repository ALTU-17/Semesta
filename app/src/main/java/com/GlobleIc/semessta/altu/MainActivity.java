package com.GlobleIc.semessta.altu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.GlobleIc.semessta.altu.Retrofit.Api;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ProductsModel> alldata = new ArrayList<>();
    RecyclerView recyclerView;
    ProgressBar ct_progbar;
    LinearLayoutManager layoutManager;
    ProductAdaptar productAdaptar;
    FloatingActionButton sem_fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.ct_recy);
        ct_progbar = findViewById(R.id.ct_progbar);
        sem_fab = findViewById(R.id.sem_fab);

        getdata();

    }

    private void getdata() {

        Api.getInfo().GetData().enqueue(new Callback<List<ProductsModel>>() {
            @Override
            public void onResponse(Call<List<ProductsModel>> call, Response<List<ProductsModel>> response) {
                Log.d("mydata001","APICalling005"+ new Gson().toJson(response.body()));

                if(response.isSuccessful()){

                    alldata.addAll(response.body());


                    for (int i = 0 ; i < alldata.size();i++){


                        layoutManager = new LinearLayoutManager((MainActivity.this));
                        recyclerView.setLayoutManager(layoutManager);
                        productAdaptar = new ProductAdaptar(alldata);
                        recyclerView.setAdapter(productAdaptar);

                        ct_progbar.setVisibility(View.GONE);
                    }


                    Log.e("mydata001","ct_titleInput "+alldata );

                }
            }

            @Override
            public void onFailure(Call<List<ProductsModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Dekho", Toast.LENGTH_SHORT).show();

            }
        });

}
}