package com.example.servicebookingapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.servicebookingapp.R;

public class MainActivity extends AppCompatActivity {

    private Button browseServicesButton;
    private Button viewBookingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browseServicesButton = findViewById(R.id.browseServicesButton);
        viewBookingsButton = findViewById(R.id.viewBookingsButton);

        browseServicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BrowseServicesActivity.class);
                startActivity(intent);
            }
        });

        viewBookingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewBookingsActivity.class);
                startActivity(intent);
            }
        });
    }
}