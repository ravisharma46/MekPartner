package com.example.mekpartner.bookings.upcoming_booking;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;

import java.util.ArrayList;

public class UpcomingBooking extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    public UpcomingBooking() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_upcoming_booking, container, false);

        ArrayList<UpcomingBookingDataClass> list = initData();

        recyclerView = v.findViewById(R.id.recyclerView2);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new UpcomingBookingAdapter(list);
        recyclerView.setAdapter(adapter);

        return v;

    }

    private ArrayList<UpcomingBookingDataClass> initData() {
        ArrayList<UpcomingBookingDataClass> list = new ArrayList<>();
        list.add(new UpcomingBookingDataClass("Awaiting partner drop off","Denting Painting"));
        list.add(new UpcomingBookingDataClass("Awaiting customer pickup","Denting Painting"));
        list.add(new UpcomingBookingDataClass("Awaiting customer Service","Emergency Towing"));
        list.add(new UpcomingBookingDataClass("Awaiting customer service","Flat Tyre"));
        list.add(new UpcomingBookingDataClass("Awaiting customer service","Onsite assistance"));

        return list;
    }

}