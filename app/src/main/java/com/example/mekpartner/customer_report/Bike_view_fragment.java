package com.example.mekpartner.customer_report;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.mekpartner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bike_view_fragment extends Fragment {


    public Bike_view_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bike_view_fragment, container, false);
    }

}
