package com.example.mekpartner.LoginRelated.SpCabs_More.History;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mekpartner.LoginRelated.SpCabs_More.NewBooking.SpNewBookingDataClass;
import com.example.mekpartner.LoginRelated.SpCabs_More.UpcomingBooking.SpUpcomingBookingAdapter;
import com.example.mekpartner.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class History_sp_fragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    public History_sp_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_history_sp_fragment, container, false);

        ArrayList<SpNewBookingDataClass> list = initData();





        recyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewspHs);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new HistorySpAdapter(list);
        recyclerView.setAdapter(adapter);


        return v;
    }

    private ArrayList<SpNewBookingDataClass> initData() {
        ArrayList<SpNewBookingDataClass> list = new ArrayList<>();
        list.add(new SpNewBookingDataClass("Agra"));
        list.add(new SpNewBookingDataClass("Jaipur"));
        list.add(new SpNewBookingDataClass("Lucknow"));
        list.add(new SpNewBookingDataClass("Allahbad"));




        return list;
    }

}
