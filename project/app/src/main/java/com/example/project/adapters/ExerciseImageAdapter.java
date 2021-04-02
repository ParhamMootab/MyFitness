package com.example.project.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.project.R;
import com.example.project.model.ExerciseImage;

import java.util.List;

public class ExerciseImageAdapter extends BaseAdapter {
    List<ExerciseImage> exerciseImageList;

    public ExerciseImageAdapter(List<ExerciseImage> exerciseImageList) {
        this.exerciseImageList = exerciseImageList;
    }

    @Override
    public int getCount() {
        return exerciseImageList.size();
    }

    @Override
    public Object getItem(int position) {
        return exerciseImageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            convertView = layoutInflater.inflate(R.layout.gridexercises, parent,false);
        }
        ImageView imgGridViewExternalLayoutForExercises = convertView.findViewById(R.id.imgGridViewExternalLayoutForExercises);
        imgGridViewExternalLayoutForExercises.setImageResource(exerciseImageList.get(position).getImgPic());

        return convertView;
    }
}
