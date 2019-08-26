package com.example.mekpartner.bookings.ongoing_booking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;

import java.util.ArrayList;

public class OngoingBooking extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    public OngoingBooking() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_ongoing_booking, container, false);

        ArrayList<OngoingBookingDataClass> list = initData();

        recyclerView = v.findViewById(R.id.recyclerView3);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new OngoingBookingAdapter(list);
        recyclerView.setAdapter(adapter);

        return v;

    }

    private ArrayList<OngoingBookingDataClass> initData() {
        ArrayList<OngoingBookingDataClass> list = new ArrayList<>();
        list.add(new OngoingBookingDataClass("Service in progress","Denting Painting"));
        list.add(new OngoingBookingDataClass("Service in progress","Emergency Towing"));
        list.add(new OngoingBookingDataClass("Service in progress","Flat Tyre"));

        return list;
    }

}