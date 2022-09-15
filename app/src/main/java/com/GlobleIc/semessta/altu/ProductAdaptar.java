package com.GlobleIc.semessta.altu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdaptar extends RecyclerView.Adapter<ProductAdaptar.myviewholder> {

    private List<ProductsModel> alldata;


//    public ProductAdaptar(ArrayList<ProductsModel> alldata, Context context) {
//        this.alldata = alldata;
//        this.context = context;
//    }

    public ProductAdaptar(List<ProductsModel> alldata) {
        this.alldata = alldata;

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout
                .row_for_product_list, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.tv_name.setText("Name :"+alldata.get(position).getPname());
        holder.tv_desc.setText("Description :"+alldata.get(position).getDescription());
        holder.tv_price.setText("Price :"+alldata.get(position).getPprice());

        Glide.with(holder.img.getContext()).load(alldata.get(position)
                .getSmall_image())
                .into(holder.img);
        Log.e("mydata001","ct_titleInput "+ alldata.get(position).getBase_image() );


        //holder.tv.append("Service"+allDataShowResponseModel.getTicket_list().get(position).getService_name());
    }

    @Override
    public int getItemCount() {
        return alldata.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv_name,tv_desc,tv_price;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.prodimg);
            tv_name = itemView.findViewById(R.id.item_name);
            tv_desc = itemView.findViewById(R.id.item_short_desc);
            tv_price = itemView.findViewById(R.id.category_discount);
        }
    }
}
