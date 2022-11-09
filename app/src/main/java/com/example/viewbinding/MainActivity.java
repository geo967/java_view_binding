package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viewbinding.databinding.ActivityMainBinding;

public class MainActivity<ResultProfileBinding> extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        activityMainBinding =ActivityMainBinding.inflate(getLayoutInflater());
        View view =activityMainBinding.getRoot();
        setContentView(view);

        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"pressed",Toast.LENGTH_LONG).show();
            }
        });
    }
}