package com.harianplanet.roaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.harianplanet.roaster.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //view binding to activity
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // hide default Action Bar on top of the screen
        getActionBar().hide();
    }
}