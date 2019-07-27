package com.example.mekpartner.LoginRelated.SpCabs_More.UpcomingBooking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.LoginRelated.SpCabs_More.NewBooking.AcceptNewBooking;
import com.example.mekpartner.LoginRelated.SpCabs_More.NewBooking.SpNewBookingDataClass;
import com.example.mekpartner.R;

import java.util.ArrayList;

public class SpUpcomingBookingAdapter extends RecyclerView.Adapter<SpUpcomingBookingAdapter.ViewHolder> {



    private Context context;
    private ArrayList<SpNewBookingDataClass> dataArrayList;


    public  SpUpcomingBookingAdapter(ArrayList<SpNewBookingDataClass> dataArrayList) {
        this.dataArrayList = dataArrayList;

    }

    @NonNull
    @Override
    public  SpUpcomingBookingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.sp_upcoming_booking_list, viewGroup, false);
        return new  SpUpcomingBookingAdapter.ViewHolder(v);


    }


    @Override
    public void onBindViewHolder(@NonNull  SpUpcomingBookingAdapter.ViewHolder viewHolder, int i) {

        final SpNewBookingDataClass data = dataArrayList.get(i);


        viewHolder.textViewdestination.setText(data.getDestination());






        viewHolder.cv_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), UpcomigBookingDetailSp.class);
                view.getContext().startActivity(i);

            }
        });



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
        private TextView textViewdestination, textViewservicetype;
        private CardView cv_details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cv_details= itemView.findViewById(R.id.cv_details);
            textViewdestination=itemView.findViewById(R.id.tv_destination);


        }
    }

}


