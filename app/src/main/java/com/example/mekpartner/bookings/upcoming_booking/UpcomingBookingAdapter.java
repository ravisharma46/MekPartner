package com.example.mekpartner.bookings.upcoming_booking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;
import com.example.mekpartner.services.regular_service_partner.CustomerPickup;
import com.example.mekpartner.services.regular_service_partner.Ub_PartnerDropOff;
import com.example.mekpartner.services.sos_sp.for_rest_service.ConfirmPickup_fRs;

import java.util.ArrayList;

public class UpcomingBookingAdapter extends RecyclerView.Adapter<UpcomingBookingAdapter.ViewHolder> {

    private Context context;
    private ArrayList<UpcomingBookingDataClass> dataArrayList;


    public UpcomingBookingAdapter(ArrayList<UpcomingBookingDataClass> dataArrayList) {
        this.dataArrayList = dataArrayList;

    }

    @NonNull
    @Override
    public UpcomingBookingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.upcoming_booking_list, viewGroup, false);
        return new UpcomingBookingAdapter.ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingBookingAdapter.ViewHolder viewHolder, int i) {

        final UpcomingBookingDataClass data = dataArrayList.get(i);

        viewHolder.textViewStatus.setText(data.getStatus());
        viewHolder.textViewservicetype.setText(data.getServiceType());

        //viewHolder.textViewRupee.setText("\u20B9" + " 99");

        String serviceType=data.getServiceType();
        String status=data.getStatus();

        if(serviceType.contains("Denting Painting")){

            if(status.contains("Awaiting customer pickup")){
                viewHolder.cv_details.setOnClickListener(view -> {
                    Intent i13 = new Intent(view.getContext(), CustomerPickup.class);
                    view.getContext().startActivity(i13);

                });
            }

            else{
                viewHolder.cv_details.setOnClickListener(view -> {
                    Intent i12 = new Intent(view.getContext(), Ub_PartnerDropOff.class);
                    view.getContext().startActivity(i12);

                });
            }

        }

        else{
            viewHolder.cv_details.setOnClickListener(view -> {
                Intent i1 = new Intent(view.getContext(), ConfirmPickup_fRs.class);
                view.getContext().startActivity(i1);

            });
        }

//        if (status.contains("Awaiting partner drop off")) {
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
