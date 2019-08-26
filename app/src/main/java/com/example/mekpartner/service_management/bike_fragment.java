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
public class bike_fragment extends Fragment {

    private TextView btn_general_service_details, btn_reparing_details,btn_wheel_care_details,btn_body_part_fixer,btn_bike_and_engine,btn_others;
    private LinearLayout general, reparing, wheelcare, bodyPartFixer, bikeandengine,others;
    private boolean isExpand = false;
    private ScrollView mscrollView;
    private LinearLayout ll1;

    public bike_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bike_management, container, false);

        btn_general_service_details = v.findViewById(R.id.btn_bike_general_details);
        btn_reparing_details = v.findViewById(R.id.btn_bike_reparing_details);
        btn_wheel_care_details = v.findViewById(R.id.btn_bike_wheel_care_details);
        btn_body_part_fixer = v.findViewById(R.id.btn_bike_body_part_fixer_details);
        btn_bike_and_engine = v.findViewById(R.id.btn_bike_and_engine_details);
        btn_others = v.findViewById(R.id.btn_bike_othersDetails);

        general = v.findViewById(R.id.btn_bike_general);
        reparing = v.findViewById(R.id.btn_bike_reparing);
        wheelcare = v.findViewById(R.id.btn_bike_wheel_care);
        bodyPartFixer = v.findViewById(R.id.btn_bike_body_part_fixer);
        bikeandengine = v.findViewById(R.id.btn_bike_and_engine);
        others = v.findViewById(R.id.btn_bike_others);
        mscrollView=v.findViewById(R.id.sc_scrollView);

        ll1=v.findViewById(R.id.ll_bikeandenginecare);

        btn_general_service_details.setOnClickListener(view -> {

            if(!isExpand){
                general.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                general.setVisibility(View.GONE);
                isExpand = false;
            }

        });

        btn_bike_and_engine.setOnClickListener(view -> {

            if(!isExpand){
                bikeandengine.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                bikeandengine.setVisibility(View.GONE);
                isExpand = false;
            }


        });

        btn_others.setOnClickListener(view -> {

            if(!isExpand){
                others.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                others.setVisibility(View.GONE);
                isExpand = false;
            }

        });

        btn_body_part_fixer.setOnClickListener(view -> {

            if(!isExpand){
                bodyPartFixer.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                bodyPartFixer.setVisibility(View.GONE);
                isExpand = false;
            }

        });

        btn_wheel_care_details.setOnClickListener(view -> {

            if(!isExpand){
                wheelcare.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                wheelcare.setVisibility(View.GONE);
                isExpand = false;
            }

        });
        btn_reparing_details.setOnClickListener(view -> {

            if(!isExpand){
                reparing.setVisibility(View.VISIBLE);
                isExpand = true;
            }else{
                reparing.setVisibility(View.GONE);
                isExpand = false;
            }

        });





        return v;
    }

}
