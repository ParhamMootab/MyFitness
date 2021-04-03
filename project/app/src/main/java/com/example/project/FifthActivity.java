package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;

public class FifthActivity extends AppCompatActivity {

    final String TAG = "MyFitness";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        //FindView
        VideoView vidViewExercise = findViewById(R.id.vidViewExercise);
        ScrollView scrollViewExerciseInstruction = findViewById(R.id.scrollViewExerciseInstruction);
        TextView txtViewExerciseInstruction = findViewById(R.id.txtViewExerciseInstruction);


        //get the exercisesDrawable id from the bundle of fourthActivity
        int exerciseDrawableId = getIntent().getExtras().getInt("ExerciseKey");

        //MediaController
        MediaController mediaController = new MediaController(this);

        //Set MediaController for the Video View
        vidViewExercise.setMediaController(mediaController);
        mediaController.setAnchorView(vidViewExercise);

        try {
            Uri uri;
            Spanned spanned;
            switch (exerciseDrawableId){
                case R.drawable.cablekneelingcrunch:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/cablekneelingcrunch.mp4?alt=media&token=c131a53a-5802-438e-9ef4-128af807725c");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    spanned = Html.fromHtml(getString(R.string.CableKneelingCrunch));
                    txtViewExerciseInstruction.setText(spanned);
                    break;

                case R.drawable.cabletwist:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/ExRx.net%20-%20Cable%20Twist.mp4?alt=media&token=fd44c36d-2a85-426f-b76c-63220cc9fcfc");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    spanned = Html.fromHtml(getString(R.string.CableTwist));
                    txtViewExerciseInstruction.setText(spanned);
                    break;

            }

            //Start video
            vidViewExercise.start();
        }catch (Exception exception){
            Log.d("MyFitness",exception.getMessage());
        }



    }
}