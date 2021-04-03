package com.example.project.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project.R;
import com.example.project.model.Meal;

import java.util.ArrayList;
import java.util.List;

public class MealAdapter extends BaseAdapter {

    List<Meal> meals;

    public MealAdapter(List<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public int getCount() {
        return meals.size();
    }

    @Override
    public Object getItem(int position) {
        return meals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            convertView = layoutInflater.inflate(R.layout.gridbodyparts, parent, false);
        }

        ImageView imgGridViewExternalLayoutForBodyParts= convertView.findViewById(R.id.imgGridViewExternalLayoutForBodyParts);
        TextView itemName = convertView.findViewById(R.id.itemName_textView);
        imgGridViewExternalLayoutForBodyParts.setImageResource(meals.get(position).getImage());
        itemName.setText(meals.get(position).getName());

        return convertView;

    }
}
