package com.example.mekpartner.LoginRelated.Bookings.OngoingBooking;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mekpartner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OngoingBooking extends Fragment {


    public OngoingBooking() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ongoing_booking, container, false);
    }

}
