package com.example.clicklistenerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.clicklistenerapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // using DataBindingUtil class to get an instance of the binding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // setting the ViewModel (check activity_main.xml)
        binding.setCounterViewModel(new ViewModelProvider(this).get(CounterViewModel.class));

        // setting the lifecycle owner of the binding object
        binding.setLifecycleOwner(this);

        binding.button.setOnClickListener(v -> {
            // incrementing the value of number of clicks. The value is automatically
            // updated in the corresponding TextView. No need to call setText method
            binding.getCounterViewModel().add();
        });
    }


}