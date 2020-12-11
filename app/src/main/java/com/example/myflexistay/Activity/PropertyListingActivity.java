package com.example.myflexistay.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.myflexistay.Adapter.PropertyListingAdapter;
import com.example.myflexistay.Navigation.Categoryscreen;
import com.example.myflexistay.R;

public class PropertyListingActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_listing);

        toolbar = findViewById(R.id.listing_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        recyclerView = findViewById(R.id.recycler_listing);
        recyclerView.setLayoutManager(new LinearLayoutManager(PropertyListingActivity.this));
        recyclerView.setAdapter(new PropertyListingAdapter());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(PropertyListingActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();
    }
}







//
//<LinearLayout
//        android:id="@+id/linearLayout4"
//                android:layout_width="match_parent"
//                android:layout_height="wrap_content"
//                android:layout_marginStart="24dp"
//                android:layout_marginTop="16dp"
//                android:layout_marginEnd="24dp"
//                android:orientation="horizontal"
//                app:layout_constraintEnd_toEndOf="parent"
//                app:layout_constraintStart_toStartOf="parent"
//                app:layout_constraintTop_toBottomOf="@+id/linearLayout3">
//
//<ImageView
//            android:layout_width="20dp"
//                    android:layout_height="20dp"
//                    android:scaleType="fitXY"
//                    android:layout_gravity="center"
//                    android:src="@drawable/furnish"/>
//
//<TextView
//            android:layout_width="wrap_content"
//                    android:layout_height="wrap_content"
//                    android:layout_marginLeft="8dp"
//                    android:text="Furnished"
//                    android:textColor="@color/colorBlack"
//                    android:layout_gravity="center"/>
//
//<View
//            android:id="@+id/divider5"
//                    android:layout_width="1dp"
//                    android:layout_height="match_parent"
//                    android:layout_marginLeft="8dp"
//                    android:background="?android:attr/listDivider" />
//
//<ImageView
//            android:layout_width="20dp"
//                    android:layout_height="20dp"
//                    android:scaleType="fitXY"
//                    android:layout_marginLeft="8dp"
//                    android:layout_gravity="center"
//                    android:src="@drawable/years"/>
//
//<TextView
//            android:layout_width="wrap_content"
//                    android:layout_height="wrap_content"
//                    android:layout_marginLeft="8dp"
//                    android:text="5 Years"
//                    android:textColor="@color/colorBlack"
//                    android:layout_gravity="center" />
//
//<View
//            android:id="@+id/divider6"
//                    android:layout_width="1dp"
//                    android:layout_height="match_parent"
//                    android:layout_marginLeft="8dp"
//                    android:background="?android:attr/listDivider" />
//
//<ImageView
//            android:layout_width="20dp"
//                    android:layout_height="20dp"
//                    android:scaleType="fitXY"
//                    android:layout_marginLeft="8dp"
//                    android:layout_gravity="center"
//                    android:src="@drawable/all"
//                    />
//
//<TextView
//            android:layout_width="wrap_content"
//                    android:layout_height="wrap_content"
//                    android:layout_marginLeft="8dp"
//                    android:text="All"
//                    android:textColor="@color/colorBlack"
//                    android:layout_gravity="center" />
//
//<View
//            android:id="@+id/divider7"
//                    android:layout_width="1dp"
//                    android:layout_height="match_parent"
//                    android:layout_marginLeft="8dp"
//                    android:background="?android:attr/listDivider" />
//
//<ImageView
//            android:layout_width="20dp"
//                    android:layout_height="20dp"
//                    android:scaleType="fitXY"
//                    android:layout_marginLeft="8dp"
//                    android:layout_gravity="center"
//                    android:src="@drawable/area"/>
//
//<TextView
//            android:layout_width="wrap_content"
//                    android:layout_height="wrap_content"
//                    android:layout_marginLeft="8dp"
//                    android:text="850 sqft"
//                    android:textColor="@color/colorBlack"
//                    android:layout_gravity="center" />
//
//</LinearLayout>
