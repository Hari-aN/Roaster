package com.harianplanet.roaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.harianplanet.roaster.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //view binding to activity
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // hide default Action Bar on top of the screen
        getActionBar().hide();
    }
}