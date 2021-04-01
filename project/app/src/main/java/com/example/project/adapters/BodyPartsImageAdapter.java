package com.example.project.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.project.R;
import com.example.project.model.BodyPartsImage;

import java.util.List;

public class BodyPartsImageAdapter extends BaseAdapter {
    List<BodyPartsImage> bodyPartsImageList;

    public BodyPartsImageAdapter(List<BodyPartsImage> bodyPartsImageList) {
        this.bodyPartsImageList = bodyPartsImageList;
    }

    @Override
    public int getCount() {
        return bodyPartsImageList.size();
    }

    @Override
    public Object getItem(int position) {
        return bodyPartsImageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            convertView = layoutInflater.inflate(R.layout.gridbodyparts, parent,false);
        }
        ImageView imgGridViewExternalLayoutForBodyParts= convertView.findViewById(R.id.imgGridViewExternalLayoutForBodyParts);
        imgGridViewExternalLayoutForBodyParts.setImageResource(bodyPartsImageList.get(position).getImgPic());

        return convertView;
    }
}
