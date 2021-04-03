package com.example.project.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import android.widget.TableLayout;

import android.widget.Toast;


import com.example.project.adapters.MealAdapter;
import com.example.project.model.BodyPartsImage;
import com.example.project.adapters.BodyPartsImageAdapter;
import com.example.project.R;
import com.example.project.model.Meal;
import com.example.project.model.MealsArray;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    List<BodyPartsImage> BodyPartsImageList = new ArrayList<>();

    List<Meal> meals = MealsArray.mealList();

    Toast currToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Call the AddDataToBodyPartImageList method
        AddDataToBodyPartImageList();

        //Find View
        GridView gridViewBodyPartsGallery= findViewById(R.id.gridViewBodyPartsGallery);
        TabLayout tabLayout = findViewById(R.id.tabBar);
        TabItem workoutTab = findViewById(R.id.Workouts_Tab);
        TabItem dietTab = findViewById(R.id.Diets_Tab);

        int index = tabLayout.getSelectedTabPosition();

        //set the layout fro the gridView
        gridViewBodyPartsGallery.setNumColumns(3);
        gridViewBodyPartsGallery.setHorizontalSpacing(8);
        gridViewBodyPartsGallery.setVerticalSpacing(70);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override

            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 1){
                    gridViewBodyPartsGallery.setAdapter(new MealAdapter(meals));
                }else {
                    //Adapter
                    BodyPartsImageAdapter myBodyPartImageAdapter = new BodyPartsImageAdapter(BodyPartsImageList);
                    //Set the adapter to the gridView
                    gridViewBodyPartsGallery.setAdapter(myBodyPartImageAdapter);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }
        });




        //Set on Click for the gridView to display the chosen picture
        gridViewBodyPartsGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                try {
                if (tabLayout.getSelectedTabPosition() == 1){



                }else {

                    /*int imgViewBodyPartLargeDrawableID= (Integer)imgViewBodyPartLarge.getTag();

                        switch (imgViewBodyPartLargeDrawableID)
                        {
                            case R.drawable.abs:
                                bundle.putInt("BodyPartKey", 0);
                                break;
                            case R.drawable.arm:
                                bundle.putInt("BodyPartKey", 1);
                                break;
                            case R.drawable.back:
                                bundle.putInt("BodyPartKey", 2);
                                break;
                            case R.drawable.chest:
                                bundle.putInt("BodyPartKey", 3);
                                break;
                            case R.drawable.leg:
                                bundle.putInt("BodyPartKey", 4);
                                break;
                            case R.drawable.lower:
                                bundle.putInt("BodyPartKey", 5);
                                break;
                            case R.drawable.shoulder:
                                bundle.putInt("BodyPartKey", 6);
                                break;
                            case R.drawable.upperbody:
                                bundle.putInt("BodyPartKey", 7);
                                break;

                        }*/

            public void onClick(View v) {
                try {
                    Bundle bundle = new Bundle();
                    int imgViewBodyPartLargeDrawableID= (Integer)imgViewBodyPartLarge.getTag();
                    switch (imgViewBodyPartLargeDrawableID)
                    {
                        case R.drawable.abs:
                            bundle.putInt("BodyPartKey", 0);
                            break;
                        case R.drawable.arm:
                            bundle.putInt("BodyPartKey", 1);
                            break;
                        case R.drawable.back:
                            bundle.putInt("BodyPartKey", 2);
                            break;
                        case R.drawable.chest:
                            bundle.putInt("BodyPartKey", 3);
                            break;
                        case R.drawable.leg:
                            bundle.putInt("BodyPartKey", 4);
                            break;
                        case R.drawable.lower:
                            bundle.putInt("BodyPartKey", 5);
                            break;
                        case R.drawable.shoulder:
                            bundle.putInt("BodyPartKey", 6);
                            break;
                        case R.drawable.upperbody:
                            bundle.putInt("BodyPartKey", 7);
                            break;
                        default:
                            bundle.putInt("BodyPartKey", 1);
                            break;
                    }

                    //start another activity with that body parts
                    Intent myFourthActivity = new Intent(ThirdActivity.this, FourthActivity.class);
                    myFourthActivity.putExtras(bundle);
                    startActivity(myFourthActivity);
                }

                } catch (Exception exception){
                    currToast= Toast.makeText(ThirdActivity.this, "Please press on the picture of body parts you want to work on!", Toast.LENGTH_SHORT);
                    currToast.show();
                    Log.d("My Fitness",exception.getMessage());
                }


            }
        });


    }

    //Adding data to the BodypartImage object method
    private void AddDataToBodyPartImageList() {
        //This code below will be replaced by reading from folder,
        // For now i will add them manually
        BodyPartsImageList.add(new BodyPartsImage("Abs", R.drawable.abs));
        BodyPartsImageList.add(new BodyPartsImage("Arms", R.drawable.arm));
        BodyPartsImageList.add(new BodyPartsImage("Backs", R.drawable.back));
        BodyPartsImageList.add(new BodyPartsImage("Chest", R.drawable.chest));
        BodyPartsImageList.add(new BodyPartsImage("Legs", R.drawable.leg));
        BodyPartsImageList.add(new BodyPartsImage("Lower body", R.drawable.lower));
        BodyPartsImageList.add(new BodyPartsImage("Shoulder", R.drawable.shoulder));
        BodyPartsImageList.add(new BodyPartsImage("Upper body", R.drawable.upperbody));
        BodyPartsImageList.add(new BodyPartsImage("Cardio", R.drawable.cardio));

    }




}