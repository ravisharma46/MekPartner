package com.example.mekpartner.service_management;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.mekpartner.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class car_management extends Fragment {

    private TextView btn_general_Details, btn_repaing_details, btn_denting_panting, btn_car_care, btn_others,btn_Wheel_care;
    private LinearLayout general, reparing, car_care, dentingpainting, others, wheelcare;
    private boolean isExpand = false;
    private ScrollView mscrollView;

    public car_management() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_car_management, container, false);

        btn_car_care = v.findViewById(R.id.btn_car_care_services_details);
        btn_denting_panting = v.findViewById(R.id.btn_denting_painting_services_details);
        btn_repaing_details = v.findViewById(R.id.btn_reparing_details);
        btn_general_Details = v.findViewById(R.id.btn_gen_details);
        btn_others = v.findViewById(R.id.btn_othersDetails);
        btn_Wheel_care = v.findViewById(R.id.btn_wheel_care_details);

        general = v.findViewById(R.id.generalDetails);
        reparing = v.findViewById(R.id.reparingDetails);
        dentingpainting = v.findViewById(R.id.dentingPentingDetails);
        car_care = v.findViewById(R.id.carcareDetails);
        others = v.findViewById(R.id.otherDetails);
        wheelcare = v.findViewById(R.id.wheelcareDetails);

        mscrollView=v.findViewById(R.id.sc_scrollView);

        btn_general_Details.setOnClickListener(view -> {

            if(!isExpand){
                general.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                general.setVisibility(View.GONE);
                isExpand = false;
            }
            mscrollView.fullScroll(View.FOCUS_DOWN);

        });

        btn_car_care.setOnClickListener(view -> {

            if(!isExpand){
                car_care.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                car_care.setVisibility(View.GONE);
                isExpand = false;
            }
            mscrollView.fullScroll(View.FOCUS_DOWN);

        });

        btn_others.setOnClickListener(view -> {

            if(!isExpand){
                others.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                others.setVisibility(View.GONE);
                isExpand = false;
            }
            mscrollView.fullScroll(View.FOCUS_DOWN);

        });

        btn_repaing_details.setOnClickListener(view -> {

            if(!isExpand){
                reparing.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                reparing.setVisibility(View.GONE);
                isExpand = false;
            }
            mscrollView.fullScroll(View.FOCUS_DOWN);

        });

        btn_denting_panting.setOnClickListener(view -> {

            if(!isExpand){
                dentingpainting.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                dentingpainting.setVisibility(View.GONE);
                isExpand = false;
            }
            mscrollView.fullScroll(View.FOCUS_DOWN);

        });

        btn_Wheel_care.setOnClickListener(view -> {

            if(!isExpand){
                wheelcare.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                wheelcare.setVisibility(View.GONE);
                isExpand = false;
            }

            mscrollView.fullScroll(View.FOCUS_DOWN);
        });




        return v;
    }

}
