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
                //Abs
                case R.drawable.cablekneelingcrunch:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/cablekneelingcrunch.mp4?alt=media&token=c131a53a-5802-438e-9ef4-128af807725c");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CableKneelingCrunch);
                    break;

                case R.drawable.cabletwist:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/ExRx.net%20-%20Cable%20Twist.mp4?alt=media&token=fd44c36d-2a85-426f-b76c-63220cc9fcfc");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CableTwist);
                    break;
                case R.drawable.dbsidebend:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/ExRx.net%20-%20Dumbbell%20Side%20Bend.mp4?alt=media&token=5caff433-72b5-4f7e-9cf7-bd9bb73b69cd");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DbSideBend);
                    break;
                case R.drawable.frontplank:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/ExRx.net%20-%20Dumbbell%20Side%20Bend.mp4?alt=media&token=5caff433-72b5-4f7e-9cf7-bd9bb73b69cd");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.FrontPlank);
                    break;
                case R.drawable.hanginglegraises:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/ExRx.net%20-%20Hanging%20Leg%20Raise.mp4?alt=media&token=e3ba77ef-6fd2-4285-bd6a-3c0884630ec8");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.HangingLegRaise);
                    break;
                case R.drawable.wheelrollout:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Wheel%20Rollout.mp4?alt=media&token=8cd2c9da-0d49-44cd-a1c8-e03f7fc4d53b");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.WheelRollout);
                    break;

                //Arm
                case R.drawable.bbcurls:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Wheel%20Rollout.mp4?alt=media&token=8cd2c9da-0d49-44cd-a1c8-e03f7fc4d53b");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.BarbellCurl);
                    break;
                case R.drawable.cableropecurls:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/CableRopeCurl.mp4?alt=media&token=44bd3031-5990-4857-9013-70e5a333c2fa");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CableRopeCurl);
                    break;
                case R.drawable.closegripbbpress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/CloseGripBBPress.mp4?alt=media&token=b542fa2b-f075-405a-b220-8c2c6144c5c9");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CloseGripBBPress);
                    break;
                case R.drawable.dbcrossbodyhammercurl:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/CloseGripBBPress.mp4?alt=media&token=b542fa2b-f075-405a-b220-8c2c6144c5c9");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DbCrossbodyHamerCurl);
                    break;
                case R.drawable.dbtricepkickbacks:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/dumbbelltricepkickback.mp4?alt=media&token=d372a472-b379-4759-a23f-5342afde2616");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DbTricepKickBack);
                    break;
                case R.drawable.declinedbtricepextension:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/declineDbTricepExtension.mp4?alt=media&token=20ae86fa-3551-4d57-bd97-381a1202594e");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DeclineDBTricepExtension);
                    break;

                //BackDay
                case R.drawable.bbshrugs:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/BarbellShrug.mp4?alt=media&token=48056dd7-66e0-41ce-9263-15fcf3b46179");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.BBshrugs);
                    break;
                case R.drawable.bbuprightrows:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/barbelluprightrow.mp4?alt=media&token=8e6651fa-1433-4b4f-80b1-144808004f2b");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.BBUprightRow);
                    break;
                case R.drawable.cablerows:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/cablerow.mp4?alt=media&token=86488c33-26b6-48e0-ba79-d91b123ff054");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CableRow);
                    break;
                case R.drawable.deadlifts:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/DeadLifts.mp4?alt=media&token=4cc59a1c-d53e-485f-aa54-4241325a5d3a");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DeadLifts);
                    break;
                case R.drawable.pullups:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Pull-up%20(Wide%20Grip).mp4?alt=media&token=9bd82479-0fc7-4cb1-8956-3e4c0c1b1560");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.PullUp);
                    break;
                case R.drawable.singlearmdbrows:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/SingleArmDBRows.mp4?alt=media&token=0682741d-1d1e-47bb-a0eb-c18e50022876");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.SingleArmDbRows);
                    break;

                //Chest
                case R.drawable.cablecrossover:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/CableCrossOver.webm?alt=media&token=0229caea-11ba-41bb-a6e3-13a4c05f565e");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CableCrossover);
                    break;
                case R.drawable.dbpullovers:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/DumbbellPulloverGuide.mp4?alt=media&token=9bc2603d-4a73-4d04-bedc-013345cb28dd");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DbPullOver);
                    break;
                case R.drawable.declinebbpress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Barbell%20Decline%20Bench%20Press.mp4?alt=media&token=9590da85-95e6-4c4a-a1a2-0e50afa4d0ff");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DeclineBarbellPress);
                    break;
                case R.drawable.flatbbpress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Flat%20Barbell%20Bench%20Press%20(power%20lift).mp4?alt=media&token=777ae28f-898a-4d70-b729-13deec495184");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.FlatBBpress);
                    break;
                case R.drawable.inclinedbpress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Incline%20Dumbbell%20Bench%20Press.mp4?alt=media&token=df3cac0b-7d13-4fc6-89e8-052e74d0c95f");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.InclineDumbbelBenchPress);
                    break;
                case R.drawable.pressups:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Incline%20Dumbbell%20Bench%20Press.mp4?alt=media&token=db4a0105-ab6b-49bc-a83e-8e5d755d8292");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.PressUps);
                    break;

                //Legs
                case R.drawable.barbellsquats:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/BarbellSquat.mp4?alt=media&token=4b0a3ddb-0493-4f04-999d-87d2dea33133");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.BarbellSquats);
                    break;
                case R.drawable.dumbellsplitsquats:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Dumbbell%20Split%20Squat.mp4?alt=media&token=dc0163a0-d585-41ed-b300-3dc6d7f730f7");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DumbellSplitSquat);
                    break;
                case R.drawable.hacksquats:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Hack%20Squat.mp4?alt=media&token=88c4a360-e667-4925-a7d2-be2965057f5c");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.HackSquats);
                    break;
                case R.drawable.legextensions:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Leg%20Extension.mp4?alt=media&token=d2120436-ad11-4e56-bd07-b11c7d010a19");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.HackSquats);
                    break;
                case R.drawable.legpress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/LegPress.mp4?alt=media&token=79743dc1-ecc1-457c-ba5f-76594553aab6");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.LegPress);
                    break;
                case R.drawable.bbfrontsquat:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/BBFrontSquat.mp4?alt=media&token=52ea1004-d3fa-42d0-b83f-4e620cccd87a");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.BbFrontSquat);
                    break;
                case R.drawable.dblunge:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/dumbbelllunge.mp4?alt=media&token=6409a68d-ee89-4fad-b9fe-aa6d0584dfa2");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DBLunge);
                    break;
                case R.drawable.kneelinglegscurl:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Kneeling%20Leg%20Curl.mp4?alt=media&token=d1e7f78a-98ef-4800-ba3c-92f03751324d");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.KneelingLegsCurl);
                    break;
                case R.drawable.lyinglegcurl:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/LyingLegsCurl.mp4?alt=media&token=66ee5dcc-3984-41a6-a5c5-f4fd97fb33a7");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.LyingLegCurl);
                    break;
                case R.drawable.seateddblateralraise:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/LyingLegsCurl.mp4?alt=media&token=66ee5dcc-3984-41a6-a5c5-f4fd97fb33a7");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.SeatedCalfRaise);
                    break;
                case R.drawable.standingcalfraise:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/StandingCalfRaise.mp4?alt=media&token=8bcedc94-2ec6-4adf-8eb6-38d427cd8d83");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.StandingCalfRaise);
                    break;

                //Shoulder
                case R.drawable.bbmilitarypress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/BarBellMilitaryPress.mp4?alt=media&token=9886d1b7-87c3-4aff-99cf-44414f49f635");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.MilitaryPress);
                    break;
                case R.drawable.cablefacepull:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Cable%20Face%20Pull.mp4?alt=media&token=cbe042cb-9e07-4409-b856-e626b630d6bd");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CableFacePull);
                    break;
                case R.drawable.cableonearmlateralraise:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/CableOneArmLateralRaise.mp4?alt=media&token=3ca32718-d268-4876-b2a1-8308d6e28759");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.CableOneArmLateralRaise);
                    break;
                case R.drawable.dbbentoverlateralraise:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/DumbbellBentOverLateral%20Raise.mp4?alt=media&token=ed4e6208-429e-45e3-946b-a27980a5f95c");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DumbellBentOverLateralRaise);
                    break;

                //UpperBody
                case R.drawable.dbfly:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Dumbbell%20Fly.mp4?alt=media&token=b2829bac-407d-4a97-8870-84e7183b7e78");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DbFly);
                    break;
                case R.drawable.dblateralraises:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/dumbbelllateralraise.mp4?alt=media&token=08c4c926-2d9f-4440-87b9-cc34d618acb6");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.DbLateralRaise);
                    break;
                case R.drawable.ezbarcurls:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/ezbarcurl.mp4?alt=media&token=202f97d1-57c7-419f-b7ec-392e429c21fb");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.EzBarCurls);
                    break;
                case R.drawable.inclinebbpress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Incline%20Bench%20Press.mp4?alt=media&token=669f7180-1eb6-4ef2-a28f-04ecab122616");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.InclineBBPress);
                    break;
                case R.drawable.militarypress:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/BarBellMilitaryPress.mp4?alt=media&token=9886d1b7-87c3-4aff-99cf-44414f49f635");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.MilitaryPress);
                    break;
                case R.drawable.tbarrow:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/T-Bar%20Row.mp4?alt=media&token=02d18346-5330-4c01-9f4f-559df5687b6f");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.TBarRow);
                    break;
                case R.drawable.widelatpulldown:
                    //Uri link
                    uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/myfitness-c3b29.appspot.com/o/Wide-Grip%20Lat%20Pulldown%20Exercise%20Video%20Guide%20-%20Muscle%20%26%20Fitness.mp4?alt=media&token=3ca0c5b9-207c-4083-a867-bfd2ae9c75fa");  //put the video url from firebase to here

                    vidViewExercise.setVideoURI(uri);

                    txtViewExerciseInstruction.setText(R.string.WideLatPullDown);
                    break;

                default:

                    //do nothing
                    break;

            }

            //Start video
            vidViewExercise.start();
        }catch (Exception exception){
            Log.d("MyFitness",exception.getMessage());
        }



    }
}