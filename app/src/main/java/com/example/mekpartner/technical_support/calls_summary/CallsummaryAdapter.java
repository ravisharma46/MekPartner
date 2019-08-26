package com.example.mekpartner.technical_support.calls_summary;

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
import com.example.mekpartner.technical_support.new_call.NewCallDataClass;

import java.util.ArrayList;

public class CallsummaryAdapter extends  RecyclerView.Adapter<CallsummaryAdapter.ViewHolder>{


    private Context context;
    private ArrayList<NewCallDataClass> dataArrayList;


    public CallsummaryAdapter(ArrayList<NewCallDataClass> dataArrayList) {
        this.dataArrayList = dataArrayList;

    }

    @NonNull
    @Override
    public CallsummaryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.callsummary_list, viewGroup, false);
        return new CallsummaryAdapter.ViewHolder(v);


    }


    @Override
    public void onBindViewHolder(@NonNull CallsummaryAdapter.ViewHolder viewHolder, int i) {

        final NewCallDataClass data = dataArrayList.get(i);

        viewHolder.tv_mobile.setText(data.getMobileNo());







        viewHolder.cv_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), CallSummaryActivity.class);
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
        private TextView tv_mobile, textViewservicetype;
        private CardView cv_details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_mobile= itemView.findViewById(R.id.tv_contactNumber);
            cv_details=itemView.findViewById(R.id.cv_details);




        }
    }
}


