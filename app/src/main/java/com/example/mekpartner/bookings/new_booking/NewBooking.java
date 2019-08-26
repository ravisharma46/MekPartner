package com.example.mekpartner.bookings.new_booking;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;

import java.util.ArrayList;

public class NewBooking extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    public NewBooking() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_new_booking, container, false);

        ArrayList<NewBookingDataClass> list = initData();

        recyclerView = v.findViewById(R.id.recyclerView1);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new NewBookingAdapter(list);
        recyclerView.setAdapter(adapter);

        return v;
    }

    private ArrayList<NewBookingDataClass> initData() {
        ArrayList<NewBookingDataClass> list = new ArrayList<>();
        list.add(new NewBookingDataClass("Awaiting confirmation","Denting Painting"));
        list.add(new NewBookingDataClass("Awaiting confirmation","Emergency Towing"));
        list.add(new NewBookingDataClass("Awaiting confirmation","Flat Tyre"));
        list.add(new NewBookingDataClass("Awaiting confirmation","Onsite assistance"));

        return list;
    }

}
