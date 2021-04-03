package com.example.project.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.project.DatabaseHelper;
import com.example.project.ProfileEdit;
import com.example.project.R;
import com.example.project.User;

import static android.content.Context.MODE_PRIVATE;

public class ProfileFragment extends Fragment {
    SharedPreferences sp;
    private DatabaseHelper helper;
    User user;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView txtViewUserFullName = root.findViewById(R.id.txtViewUserFullName);
        TextView txtViewUserWeight = root.findViewById(R.id.txtViewUserWeight);
        TextView txtViewUserHeight = root.findViewById(R.id.txtViewUserHeight);

        sp = this.getActivity().getSharedPreferences("login", MODE_PRIVATE);
        helper = new DatabaseHelper(getContext());
        user = helper.GetUser(sp.getInt("userId",0));

        txtViewUserFullName.setText(user.getFullName());
        txtViewUserWeight.setText(String.valueOf(user.getWeight()));
        txtViewUserHeight.setText(String.valueOf(user.getHeight()));

        Button btnEditProfile = root.findViewById(R.id.btnEditProfile);
        btnEditProfile.setOnClickListener((View v) -> {
            Intent myIntent = new Intent(getActivity(), ProfileEdit.class);
            Bundle bundle = new Bundle();
            bundle.putString("FullName", user.getFullName());
            bundle.putDouble("Weight", user.getWeight());
            bundle.putInt("Height", user.getHeight());
            myIntent.putExtras(bundle);
            startActivity(myIntent);
        });
        return root;
    }
}