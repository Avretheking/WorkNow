package com.example.servicebookingapp.activities;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.servicebookingapp.R;
import com.example.servicebookingapp.adapters.ServiceAdapter;
import com.example.servicebookingapp.models.Service;
import java.util.ArrayList;
import java.util.List;

public class BrowseServicesActivity extends AppCompatActivity {

    private ListView servicesListView;
    private ServiceAdapter serviceAdapter;
    private List<Service> services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_services);

        servicesListView = findViewById(R.id.servicesListView);

        services = new ArrayList<>();
        // Load services from JSON or database
        services.add(new Service("1", "House Cleaning", "Thorough cleaning of your entire house, including dusting, vacuuming, and mopping.", 100.0, "Home Services"));
        services.add(new Service("2", "Plumbing", "Fixing leaks, unclogging drains, and other plumbing repairs.", 70.0, "Home Services"));
        services.add(new Service("3", "Personal Training", "One-on-one personal training session to help you reach your fitness goals.", 50.0, "Health and Wellness"));
        services.add(new Service("4", "Haircut", "Professional haircut and styling.", 30.0, "Beauty Services"));
        services.add(new Service("5", "Car Wash", "Complete exterior and interior car wash.", 25.0, "Automotive Services"));
        services.add(new Service("6", "Legal Consultation", "Professional legal advice on various matters.", 150.0, "Professional Services"));
        services.add(new Service("7", "Tutoring", "One-on-one tutoring session in your subject of choice.", 40.0, "Educational Services"));
        services.add(new Service("8", "Event Planning", "Full-service event planning for your special occasions.", 500.0, "Event Services"));
        services.add(new Service("9", "Pet Grooming", "Professional grooming services for your pets.", 45.0, "Pet Services"));

        serviceAdapter = new ServiceAdapter(this, services);
        servicesListView.setAdapter(serviceAdapter);
    }
}