package com.example.mekpartner.LoginRelated.Bookings.UpcomingBooking;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mekpartner.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
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





        recyclerView = (RecyclerView)v.findViewById(R.id.recyclerView2);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new UpcomingBookingAdapter(list);
        recyclerView.setAdapter(adapter);


        return v;
        
        
    }

    private ArrayList<UpcomingBookingDataClass> initData() {
        ArrayList<UpcomingBookingDataClass> list = new ArrayList<>();
        list.add(new UpcomingBookingDataClass("Awaiting vendor drop off","Denting Painting"));
        list.add(new UpcomingBookingDataClass("Awaiting customer pickup","Denting Painting"));
        list.add(new UpcomingBookingDataClass("Payment Confirmation","Emergency Towing"));
        list.add(new UpcomingBookingDataClass("Payment Confirmation","Flat Tyre"));
        list.add(new UpcomingBookingDataClass("Payment Confirmation","Onsite assistance"));



        return list;
    }

}
