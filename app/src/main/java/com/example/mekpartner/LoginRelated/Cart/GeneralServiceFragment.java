package com.example.vendorapp.A_job_card;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vendorapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GeneralServiceFragment extends Fragment {


    public GeneralServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        MyListData[] myListData = new MyListData[] {
//                new MyListData("Primary Service", R.drawable.primary_service,R.drawable.primary_service),
//                new MyListData("Secondary Service", R.drawable.secondary_service,R.drawable.secondary_service),
//                new MyListData("Primary Service", R.drawable.primary_service,R.drawable.primary_service),
//                new MyListData("Secondary Service", R.drawable.secondary_service,R.drawable.secondary_service),
//                new MyListData("Primary Service", R.drawable.primary_service,R.drawable.primary_service),
//                new MyListData("Secondary Service", R.drawable.secondary_service,R.drawable.secondary_service),
//                new MyListData("Primary Service", R.drawable.primary_service,R.drawable.primary_service),
//        };
//
////
////        RecyclerView recyclerView = getView().findViewById(R.id.recyclerViewCart);
////        recyclerView.setHasFixedSize(true);
////        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true,));
//////        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
//
//        final View view = inflater.inflate(R.layout.fragment_general, container, false);
//        final FragmentActivity c = getActivity();
//        final RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(c,RecyclerView.HORIZONTAL,true);
//        ListAdapter adapter = new ListAdapter(myListData);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);


        return inflater.inflate(R.layout.fragment_general, container, false);
    }

}
