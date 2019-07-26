package com.example.mekpartner.LoginRelated.Bookings.History;

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
import com.example.mekpartner.LoginRelated.Services.RegularServicePartner.Ub_PartnerDropOff;
import com.example.mekpartner.LoginRelated.Services.SosSP.ForRestService.ConfirmPickup_fRs;
import com.example.mekpartner.R;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    private Context context;
    private ArrayList<HistoryDataClass> dataArrayList;


    public HistoryAdapter(ArrayList<HistoryDataClass> dataArrayList) {
        this.dataArrayList = dataArrayList;

    }

    @NonNull
    @Override
    public HistoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.history_list, viewGroup, false);
        return new HistoryAdapter.ViewHolder(v);


    }


    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.ViewHolder viewHolder, int i) {

        final HistoryDataClass data = dataArrayList.get(i);

        viewHolder.textViewStatus.setText(data.getStatus());
        viewHolder.textViewservicetype.setText(data.getServiceType());






        viewHolder.cv_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Service_completed.class);
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
        private TextView textViewStatus, textViewservicetype;
        private CardView cv_details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cv_details= itemView.findViewById(R.id.cv_details);
            textViewservicetype=itemView.findViewById(R.id.tvservicetype);
            textViewStatus=itemView.findViewById(R.id.tvstatus);



        }
    }
}

