package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class FourthActivity extends AppCompatActivity {
    final String TAG = "Concert Demo";

    List<ExerciseImage> ExerciseImageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        try {
            //get BodyPartImageLargePosition from the ThirdActivity
            int BodyPartImageLargePosition= getIntent().getExtras().getInt("BodyPartKey");

            //Call the AddDataToExerciseImageList to add the exercise base on the selected body parts
            AddDataToExerciseImageList(BodyPartImageLargePosition);

            //FindView
            GridView gridViewExerciseGallery = findViewById(R.id.gridViewExerciseGallery);

            //Adapter
            ExerciseImageAdapter myExerciseImageAdapter = new ExerciseImageAdapter(ExerciseImageList);
            //Set the adapter to the gridView
            gridViewExerciseGallery.setAdapter(myExerciseImageAdapter);
            //set the layout for the gridView
            gridViewExerciseGallery.setNumColumns(2);
            gridViewExerciseGallery.setHorizontalSpacing(8);
            gridViewExerciseGallery.setVerticalSpacing(8);

        } catch (Exception exception){
            Log.d(TAG,exception.getMessage()); //this displays as log msg the exception's object message
        }



    }

    //Adding data to the ExerciseImage object according to the BodyParts chosen
    private void AddDataToExerciseImageList(int BodyPartImageLargePosition){
        switch (BodyPartImageLargePosition){
            case 0:
                ExerciseImageList.add(new ExerciseImage("Cable Kneeling Crunch", R.drawable.cablekneelingcrunch));
                ExerciseImageList.add(new ExerciseImage("Cable twist", R.drawable.cabletwist));
                ExerciseImageList.add(new ExerciseImage("Db side bend", R.drawable.dbsidebend));
                ExerciseImageList.add(new ExerciseImage("Front plank", R.drawable.frontplank));
                ExerciseImageList.add(new ExerciseImage("Hanging leg raises", R.drawable.hanginglegraises));
                ExerciseImageList.add(new ExerciseImage("Wheel rollout", R.drawable.wheelrollout));

                break;
            case 1:
                ExerciseImageList.add(new ExerciseImage("Cable Kneeling Crunch", R.drawable.bbcurls));
                ExerciseImageList.add(new ExerciseImage("cableropecurls", R.drawable.cableropecurls));
                ExerciseImageList.add(new ExerciseImage("closegripbbpress", R.drawable.closegripbbpress));
                ExerciseImageList.add(new ExerciseImage("dbcrossbodyhammercurl", R.drawable.dbcrossbodyhammercurl));
                ExerciseImageList.add(new ExerciseImage("dbtricepkickbacks", R.drawable.dbtricepkickbacks));
                ExerciseImageList.add(new ExerciseImage("declinedbtricepextension", R.drawable.declinedbtricepextension));

                break;
            case 2:
                ExerciseImageList.add(new ExerciseImage("bbshrugs", R.drawable.bbshrugs));
                ExerciseImageList.add(new ExerciseImage("bbuprightrows", R.drawable.bbuprightrows));
                ExerciseImageList.add(new ExerciseImage("cablerows", R.drawable.cablerows));
                ExerciseImageList.add(new ExerciseImage("deadlifts", R.drawable.deadlifts));
                ExerciseImageList.add(new ExerciseImage("pullups", R.drawable.pullups));
                ExerciseImageList.add(new ExerciseImage("singlearmdbrows", R.drawable.singlearmdbrows));

                break;
            case 3:
                ExerciseImageList.add(new ExerciseImage("cablecrossover", R.drawable.cablecrossover));
                ExerciseImageList.add(new ExerciseImage("dbpullovers", R.drawable.dbpullovers));
                ExerciseImageList.add(new ExerciseImage("declinebbpress", R.drawable.declinebbpress));
                ExerciseImageList.add(new ExerciseImage("flatbbpress", R.drawable.flatbbpress));
                ExerciseImageList.add(new ExerciseImage("inclinedbpress", R.drawable.inclinedbpress));
                ExerciseImageList.add(new ExerciseImage("pressups", R.drawable.pressups));

                break;
            case 4:
                ExerciseImageList.add(new ExerciseImage("barbellsquats", R.drawable.barbellsquats));
                ExerciseImageList.add(new ExerciseImage("dumbellsplitsquats", R.drawable.dumbellsplitsquats));
                ExerciseImageList.add(new ExerciseImage("hacksquats", R.drawable.hacksquats));
                ExerciseImageList.add(new ExerciseImage("legextensions", R.drawable.legextensions));
                ExerciseImageList.add(new ExerciseImage("legpress", R.drawable.legpress));

                break;
            case 5:
                ExerciseImageList.add(new ExerciseImage("bbfrontsquat", R.drawable.bbfrontsquat));
                ExerciseImageList.add(new ExerciseImage("dblunge", R.drawable.dblunge));
                ExerciseImageList.add(new ExerciseImage("kneelinglegscurl", R.drawable.kneelinglegscurl));
                ExerciseImageList.add(new ExerciseImage("flatbbpress", R.drawable.flatbbpress));
                ExerciseImageList.add(new ExerciseImage("lyinglegcurl", R.drawable.lyinglegcurl));
                ExerciseImageList.add(new ExerciseImage("seatedcalfraise", R.drawable.seatedcalfraise));
                ExerciseImageList.add(new ExerciseImage("standingcalfraise", R.drawable.standingcalfraise));

                break;
            case 6:
                ExerciseImageList.add(new ExerciseImage("bbmilitarypress", R.drawable.bbmilitarypress));
                ExerciseImageList.add(new ExerciseImage("cablefacepull", R.drawable.cablefacepull));
                ExerciseImageList.add(new ExerciseImage("cableonearmlateralraise", R.drawable.cableonearmlateralraise));
                ExerciseImageList.add(new ExerciseImage("dbbentoverlateralraise", R.drawable.dbbentoverlateralraise));
                ExerciseImageList.add(new ExerciseImage("platefrontraise", R.drawable.platefrontraise));
                ExerciseImageList.add(new ExerciseImage("seateddblateralraise", R.drawable.seateddblateralraise));

                break;
            case 7:
                ExerciseImageList.add(new ExerciseImage("closegripbbpress", R.drawable.closegripbbpress));
                ExerciseImageList.add(new ExerciseImage("dbfly", R.drawable.dbfly));
                ExerciseImageList.add(new ExerciseImage("dblateralraises", R.drawable.dblateralraises));
                ExerciseImageList.add(new ExerciseImage("ezbarcurls", R.drawable.ezbarcurls));
                ExerciseImageList.add(new ExerciseImage("inclinebbpress", R.drawable.inclinebbpress));
                ExerciseImageList.add(new ExerciseImage("militarypress", R.drawable.militarypress));
                ExerciseImageList.add(new ExerciseImage("tbarrow", R.drawable.tbarrow));
                ExerciseImageList.add(new ExerciseImage("widelatpulldown", R.drawable.widelatpulldown));

                break;


        }
    }

}