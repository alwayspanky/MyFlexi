package com.example.myflexistay.Navigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myflexistay.Activity.MainActivity;
import com.example.myflexistay.R;

public class Categoryscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryscreen);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(Categoryscreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

//
//
//
//
//<LinearLayout
//            android:layout_width="match_parent"
//                    android:layout_height="wrap_content"
//                    android:orientation="vertical">
//
//
//<TextView
//                android:layout_width="wrap_content"
//                        android:layout_height="wrap_content"
//                        android:text="Lorem ipsum"
//                        android:layout_marginLeft="12dp"
//                        android:textStyle="bold"
//                        android:textSize="20sp"
//                        android:padding="5dp"
//                        android:textColor="@color/colorPrimaryDark"/>
//
//<TextView
//                android:layout_width="wrap_content"
//                        android:layout_height="wrap_content"
//                        android:text="Lorem ipsum dolor sit amet, consectetuer adipiscing elit,"
//                        android:layout_marginLeft="12dp"
//                        android:textSize="14sp"
//                        android:textStyle="bold"
//                        android:layout_marginTop="5dp"
//                        android:textColor="@color/colorBlack"/>

//
//
//
//<View
//                app:layout_constraintTop_toBottomOf="@+id/linear_wallet"
//                        android:id="@+id/divider1"
//                        android:layout_width="match_parent"
//                        android:layout_height="1dp"
//                        android:layout_marginLeft="10dp"
//                        android:layout_marginTop="12dp"
//                        android:layout_marginRight="10dp"
//                        android:background="@color/light_gray"/>
//
//
//
//<LinearLayout
//                android:layout_width="match_parent"
//                        android:layout_height="wrap_content"
//                        android:layout_marginBottom="10dp"
//                        android:orientation="horizontal">
//
//
//<TextView
//                    android:padding="5dp"
//                            android:layout_width="wrap_content"
//                            android:layout_height="wrap_content"
//                            android:text="Expiry: 00/00/0000"
//                            android:textSize="16sp"
//                            android:textStyle="bold"
//                            android:textAllCaps="false"
//                            android:textColor="#7E7B7B"
//                            android:layout_marginTop="8dp"
//                            android:layout_marginLeft="12dp"/>
//
//<TextView
//                    android:padding="5dp"
//                            android:layout_width="wrap_content"
//                            android:layout_height="wrap_content"
//                            android:text="Details"
//                            android:textStyle="bold"
//                            android:textSize="16sp"
//                            android:layout_marginLeft="150dp"
//                            android:textAllCaps="false"
//                            android:textColor="@color/colorAccent"
//                            android:layout_marginTop="8dp" />
//
//
//
//</LinearLayout>
//
//
//
//</LinearLayout>





//<LinearLayout
//                android:layout_width="match_parent"
//                        android:layout_height="200dp"
//                        android:orientation="vertical">
//
//
//
//<TextView
//                    android:layout_width="wrap_content"
//                            android:layout_height="wrap_content"
//                            android:text="Rent: ₹20,000"
//                            android:textStyle="bold"
//                            android:textColor="@color/colorPrimaryDark"
//                            android:layout_marginTop="16dp"
//                            android:layout_marginLeft="16dp"
//                            android:textSize="18sp"/>
//
//<TextView
//                    android:layout_width="wrap_content"
//                            android:layout_height="wrap_content"
//                            android:textStyle="bold"
//                            android:text="2BHK For Rent Shital, Kothrud"
//                            android:textColor="@color/colorBlack"
//                            android:layout_marginTop="8dp"
//                            android:layout_marginLeft="16dp"
//                            android:textSize="15sp"/>
//
//<TextView
//                    android:layout_width="wrap_content"
//                            android:layout_height="wrap_content"
//                            android:text="For Rent"
//                            android:textStyle="bold"
//                            android:textColor="@color/colorAccent"
//                            android:layout_marginTop="8dp"
//                            android:layout_marginLeft="16dp"
//                            android:textSize="15sp"/>
//
//
//
//<LinearLayout
//                    android:layout_marginLeft="10dp"
//                            android:layout_marginRight="10dp"
//                            android:layout_width="match_parent"
//                            android:layout_height="wrap_content"
//                            android:layout_marginTop="30dp">
//
//
//<Button
//                        android:layout_marginHorizontal="10dp"
//                                android:layout_width="170dp"
//                                android:layout_height="wrap_content"
//                                android:text="Edit"
//                                android:textAllCaps="false"
//                                android:textSize="15sp"
//                                android:textColor="#BCB9B9"
//                                android:background="@drawable/search_bg"/>
//
//
//
//<Button
//                        android:layout_marginHorizontal="10dp"
//                                android:layout_marginRight="30dp"
//                                android:layout_width="170dp"
//                                android:layout_height="wrap_content"
//                                android:text="Published"
//                                android:textStyle="bold"
//                                android:textSize="15sp"
//                                android:textAllCaps="false"
//                                android:textColor="@color/white"
//                                android:background="@drawable/button_green_background"/>
//
//
//</LinearLayout>

//
//
//</LinearLayout>
