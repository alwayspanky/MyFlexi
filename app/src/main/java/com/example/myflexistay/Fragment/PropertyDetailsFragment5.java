package com.example.myflexistay.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myflexistay.Adapter.Amenties_Adapter;
import com.example.myflexistay.Adapter.WaterSupply_Adapter;
import com.example.myflexistay.Api.ApiClient;
import com.example.myflexistay.Model.Amenities;
import com.example.myflexistay.Model.WaterSupply;
import com.example.myflexistay.R;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PropertyDetailsFragment5 extends Fragment {

    private EditText Water;
    Button Amenities;
    private RecyclerView recyclerView, recyclerView1;
    ArrayList<Amenities.Amenities_Types> amenitiesArrayList;
    ArrayList<WaterSupply.water_supply> waterSupplies;
    ApiClient apiClient;
    RadioButton radioButton;
    LinearLayout view;
    boolean opened;
    String SelectedWatersupply;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_property_details5, container, false);
        // Inflate the layout for this fragment

        apiClient = new ApiClient();
        amenitiesArrayList = new ArrayList<>();
        waterSupplies = new ArrayList<>();
        Amenities = v.findViewById(R.id.save_continue);
        radioButton = v.findViewById(R.id.radio_button_lift);
        recyclerView = v.findViewById(R.id.amenties_recycler);
        recyclerView1 = v.findViewById(R.id.dropdown_recyclerview);
        view = v.findViewById(R.id.dropdown_layout);



                apiClient.apiInterface.getAmenities().enqueue(new Callback<Amenities>() {
                    @Override
                    public void onResponse(Call<Amenities> call, Response<Amenities> response) {
                        if (response.isSuccessful()) {
                            amenitiesArrayList = response.body().getAmenitiesTypes();
                            GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2, LinearLayoutManager.VERTICAL, false);
                            recyclerView.setLayoutManager(gridLayoutManager);
                            Amenties_Adapter amenties_adapter = new Amenties_Adapter(getActivity(), amenitiesArrayList);
                            recyclerView.setAdapter(amenties_adapter);
                        }
                    }

                    @Override
                    public void onFailure(Call<Amenities> call, Throwable t) {
                        Log.d("TAG", "onFailure: "+t.toString());

                    }
                });


                Amenities.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Checked();

                        JsonObject data = new JsonObject();
                        try {
                            data.addProperty("s_token", "eaSGJZKWOYLpg4Q4213jND3rOneB6a6lh0gZv4Y7sG3DeowEAKUoJW6pSfjBkwQR");
                            data.addProperty("listing_id", "2");
                            data.addProperty("amenity_id", "1");

                        }catch (JsonIOException e){
                            e.printStackTrace();
                        }
                        apiClient.apiInterface.addAmenities(data).enqueue(new Callback<JsonObject>() {
                            @Override
                            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                                if (response.isSuccessful()){
                                    PropertyDetailsFragment6 fragment6 = new PropertyDetailsFragment6();
                                    FragmentManager fragmentManager = getFragmentManager();
                                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                    fragmentTransaction.replace(R.id.fragment_content, fragment6);
                                    fragmentTransaction.addToBackStack(null);
                                    fragmentTransaction.commit();
                                }else {
                                    Toast.makeText(getActivity(), "Something went wrong !", Toast.LENGTH_SHORT).show();

                                }
                            }

                            @Override
                            public void onFailure(Call<JsonObject> call, Throwable t) {
                                Toast.makeText(getActivity(), "Network Problem !", Toast.LENGTH_SHORT).show();

                            }
                        });
                    }
                });

        return v;
    }


    private void Checked(){

//        boolean isChecked = radioButton.isChecked();
//
//        if (isChecked){
//            Toast.makeText(getActivity(),
//                    radioButton.getText(),Toast.LENGTH_LONG).show();
//            radioButton.setChecked(true);
//        }else {
//            radioButton.setChecked(false);
//
//        }
    }


}