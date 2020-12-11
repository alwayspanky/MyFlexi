package com.example.myflexistay.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myflexistay.Model.ListingTypeModel;
import com.example.myflexistay.R;

import java.util.ArrayList;


public class ListingTypeAdapter extends RecyclerView.Adapter<ListingTypeAdapter.viewHolder> {

    Context context;
    ArrayList<ListingTypeModel.ListingsBean> listingTypeList;
    int lastClickedPosition = -1;

    public ListingTypeAdapter(Context context, ArrayList<ListingTypeModel.ListingsBean> listingTypeList) {
        this.context = context;
        this.listingTypeList = listingTypeList;
    }

    @NonNull
    @Override
    public ListingTypeAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listingtype_button, parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListingTypeAdapter.viewHolder holder, int position) {

       ListingTypeModel.ListingsBean listType = listingTypeList.get(position);
        holder.btn.setText(listType.getName());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return listingTypeList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        Button btn;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.button_listing);

        }
    }
}
