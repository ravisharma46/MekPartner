package com.example.mekpartner.LoginRelated.Bookings.History;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mekpartner.LoginRelated.Bookings.UpcomingBooking.UpcomingBookingAdapter;
import com.example.mekpartner.R;

import java.util.ArrayList;


public class History extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_history, container, false);


        ArrayList<HistoryDataClass> list = initData();





        recyclerView = (RecyclerView)v.findViewById(R.id.recyclerView4);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new HistoryAdapter(list);
        recyclerView.setAdapter(adapter);


        return v;
    }

    private ArrayList<HistoryDataClass> initData() {
        ArrayList<HistoryDataClass> list = new ArrayList<>();
        list.add(new HistoryDataClass("Service Completed","Denting Painting"));
        list.add(new HistoryDataClass("Service Completed","Denting Painting"));
        list.add(new HistoryDataClass("Service Completed","Emergency Towing"));
        list.add(new HistoryDataClass("Service Completed","Flat Tyre"));
        list.add(new HistoryDataClass("Service Completed","Onsite assistance"));



        return list;
    }


}
