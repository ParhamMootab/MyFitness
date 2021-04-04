package com.example.project.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.R;
import com.example.project.model.Meal;
import com.example.project.model.MealsArray;

import java.util.List;

public class MealDescriptionActivity extends AppCompatActivity {

    List<Meal> meals = MealsArray.mealList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_description);

        TextView mealName = findViewById(R.id.MealName);
        TextView mealDesc = findViewById(R.id.MealDescription);
        ImageView mealImage = findViewById(R.id.MealImage);
        Button recipeBtn = findViewById(R.id.browserBtn);

        try {
            int index = getIntent().getExtras().getInt("index");

            mealName.setText(meals.get(index).getName());
            mealDesc.setText(meals.get(index).getRecipe());
            mealImage.setImageResource(meals.get(index).getImage());

            recipeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uriUrl = Uri.parse(meals.get(index).getRecipeUrl());
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(browserIntent);
                }
            });


        }catch (Exception ex){
            Log.d("Meal Description", ex.getMessage());
        }




    }
}