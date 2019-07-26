package com.example.mekpartner.LoginRelated.Bookings.OngoingBooking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mekpartner.LoginRelated.Services.RegularServicePartner.CustomerPickup;
import com.example.mekpartner.LoginRelated.Services.RegularServicePartner.ServiceInProgress;
import com.example.mekpartner.LoginRelated.Services.RegularServicePartner.Ub_PartnerDropOff;
import com.example.mekpartner.LoginRelated.Services.SosSP.ForRestService.ConfirmPickup_fRs;
import com.example.mekpartner.LoginRelated.Services.SosSP.TowingChauffer.ChaufferCustomerDropoff;
import com.example.mekpartner.R;

import java.util.ArrayList;

public class OngoingBookingAdapter extends  RecyclerView.Adapter<OngoingBookingAdapter.ViewHolder>{

    private Context context;
    private ArrayList<OngoingBookingDataClass> dataArrayList;


    public OngoingBookingAdapter(ArrayList<OngoingBookingDataClass> dataArrayList) {
        this.dataArrayList = dataArrayList;

    }

    @NonNull
    @Override
    public OngoingBookingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.ongoing_booking_list, viewGroup, false);
        return new OngoingBookingAdapter.ViewHolder(v);


    }


    @Override
    public void onBindViewHolder(@NonNull OngoingBookingAdapter.ViewHolder viewHolder, int i) {

        final OngoingBookingDataClass data = dataArrayList.get(i);

        viewHolder.textViewStatus.setText(data.getStatus());
        viewHolder.textViewservicetype.setText(data.getServiceType());




        //viewHolder.textViewRupee.setText("\u20B9" + " 99");

        String serviceType=data.getServiceType();
        String status=data.getStatus();



        if(serviceType.contains("Denting Painting")){
            viewHolder.cv_details.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), ServiceInProgress.class);
                    i.putExtra("key","RestService");
                    view.getContext().startActivity(i);

                }
            });


        }
        if(serviceType.contains("Emergency Towing")){
            viewHolder.cv_details.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), ChaufferCustomerDropoff.class);
                    view.getContext().startActivity(i);

                }
            });


        }

        if(serviceType.contains("Flat Tyre")){
            viewHolder.cv_details.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), ServiceInProgress.class);
                    i.putExtra("key","SosRest");
                    view.getContext().startActivity(i);

                }
            });


        }







//        if (status.contains("Awaiting vendor drop off")) {
//            viewHolder.cv_details.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent i = new Intent(view.getContext(), OnGoingBookingVendorDrop.class);
//                    view.getContext().startActivity(i);
//
//                }
//            });
//
//        }





    }

    @Override
    public int getItemCount() {
        if (dataArrayList != null) {
            return dataArrayList.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewStatus, textViewservicetype;
        private CardView cv_details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cv_details= itemView.findViewById(R.id.cv_details);
            textViewservicetype= itemView.findViewById(R.id.service_type);
            textViewStatus=itemView.findViewById(R.id.tvstatus);


        }
    }
}

