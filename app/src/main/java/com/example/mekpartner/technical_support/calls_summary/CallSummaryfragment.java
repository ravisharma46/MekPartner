package com.example.mekpartner.technical_support.calls_summary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;
import com.example.mekpartner.technical_support.new_call.NewCallDataClass;

import java.util.ArrayList;


public class CallSummaryfragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;


    public CallSummaryfragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_call_summaryfragment, container, false);

        ArrayList<NewCallDataClass> list = initData();





        recyclerView = (RecyclerView)v.findViewById(R.id.recyclerView6);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new CallsummaryAdapter(list);
        recyclerView.setAdapter(adapter);


        return v;
    }

    private ArrayList< NewCallDataClass> initData() {
        ArrayList< NewCallDataClass> list = new ArrayList<>();
        list.add(new  NewCallDataClass("9836525345"));
        list.add(new  NewCallDataClass("9836522345"));
        list.add(new  NewCallDataClass("9879365223"));
        list.add(new  NewCallDataClass("9877365223"));




        return list;
    }


}
