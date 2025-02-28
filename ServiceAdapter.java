package com.example.servicebookingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.servicebookingapp.R;
import com.example.servicebookingapp.models.Service;
import java.util.List;

public class ServiceAdapter extends BaseAdapter {

    private Context context;
    private List<Service> services;

    public ServiceAdapter(Context context, List<Service> services) {
        this.context = context;
        this.services = services;
    }

    @Override
    public int getCount() {
        return services.size();
    }

    @Override
    public Object getItem(int position) {
        return services.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.service_item, parent, false);
        }

        TextView serviceNameTextView = convertView.findViewById(R.id.serviceNameTextView);
        TextView serviceDescriptionTextView = convertView.findViewById(R.id.serviceDescriptionTextView);
        TextView servicePriceTextView = convertView.findViewById(R.id.servicePriceTextView);

        Service service = services.get(position);

        serviceNameTextView.setText(service.getName());
        serviceDescriptionTextView.setText(service.getDescription());
        servicePriceTextView.setText("$" + service.getPrice());

        return convertView;
    }
}